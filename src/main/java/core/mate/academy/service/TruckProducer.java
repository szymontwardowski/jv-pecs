package core.mate.academy.service;

import java.util.Arrays;
import java.util.List;
import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return Arrays.asList(
                new Truck("T1", "Red"),
                new Truck("T2", "Red"),
                new Truck("T3", "Red")
        );
    }
}
