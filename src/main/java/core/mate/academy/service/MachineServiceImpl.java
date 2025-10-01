package core.mate.academy.service;

import java.util.List;
import java.util.Collections;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get().stream().map(m -> (Machine) m).toList();
        } else if (type == Excavator.class) {
            return new ExcavatorProducer().get().stream().map(m -> (Machine) m).toList();
        } else if (type == Truck.class) {
            return new TruckProducer().get().stream().map(m -> (Machine) m).toList();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
