import static org.junit.Assert.assertEquals;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MachineServiceTest {
    private static MachineService<Machine> machineService;

    @BeforeClass
    public static void beforeClass() {
        machineService = new MachineServiceImpl();
    }

    @Test
    public void getAll_bulldozerType() {
        List<Machine> actual = (List<Machine>) machineService.getAll(Bulldozer.class);
        Assert.assertEquals("The list should contain elements of type Bulldozer",
                Bulldozer.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_excavatorType() {
        List<Machine> actual = (List<Machine>) machineService.getAll(Excavator.class);
        Assert.assertEquals("The list should contain elements of type Excavator",
                Excavator.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_truckType() {
        List<Machine> actual = (List<Machine>) machineService.getAll(Truck.class);
        Assert.assertEquals("The list should contain elements of type Truck",
                Truck.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_invalidType() {
        List<Machine> actual = (List<Machine>) machineService.getAll(Machine.class);
        Assert.assertEquals("For the unknown class you should return empty list",
                Collections.emptyList(), actual);
    }

    @Test
    public void fill_bulldozerValue() {
        List<Machine> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Bulldozer("TestBulldozerOld"));
        }
        machineService.fill(machines, new Bulldozer("TestBulldozerNew"));
        Assert.assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Machine machine : machines) {
            Assert.assertEquals("The list should contain the new value",
                    "TestBulldozerNew", machine.getModel());
        }
    }

    @Test
    public void fill_excavatorValue() {
        List<Machine> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Excavator("TestExcavatorOld"));
        }
        machineService.fill(machines, new Excavator("TestExcavatorNew"));
        Assert.assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Machine machine : machines) {
            Assert.assertEquals("The list should contain the new value",
                    "TestExcavatorNew", machine.getModel());
        }
    }

    @Test
    public void fill_truckValueRandomSize() {
        List<Machine> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Truck("TestTruckOld"));
        }
        machineService.fill(machines, new Truck("TestTruckNew"));
        Assert.assertEquals("The list size shouldn't change", randomSize, machines.size());
        for (Machine machine : machines) {
            Assert.assertEquals("The list should contain the new value",
                    "TestTruckNew", machine.getModel());
        }
    }

    @Test
    public void startWorking_bulldozers() {
        List<Bulldozer> bulldozers = List.of(new Bulldozer("B1"));
        machineService.startWorking(bulldozers);
    }

    @Test
    public void startWorking_excavators() {
        List<Excavator> excavators = List.of(new Excavator("E1"));
        machineService.startWorking(excavators);
    }

    @Test
    public void startWorking_trucks() {
        List<Truck> trucks = List.of(new Truck("T1"));
        machineService.startWorking(trucks);
    }
}