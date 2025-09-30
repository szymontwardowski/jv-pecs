package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;
import java.util.Arrays;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return Arrays.asList(
                new Truck("C1", "Black"),
                new Truck("C2", "White"),
                new Truck("C3", "Orange")
        );
    }

}



