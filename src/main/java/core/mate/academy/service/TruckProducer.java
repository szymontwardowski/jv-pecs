package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;
import java.util.Arrays;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return Arrays.asList(
                new Truck("C1", "Green"),
                new Truck("C2", "Blue"),
                new Truck("C3", "Gray")
        );
    }
}
