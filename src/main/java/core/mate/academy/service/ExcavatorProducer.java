package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;
import java.util.Arrays;


public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return Arrays.asList(
                new Excavator("B1", "White"),
                new Excavator("B2", "black"),
                new Excavator("B3", "Orange")
        );
    }
}
