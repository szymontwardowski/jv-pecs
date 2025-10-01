package core.mate.academy.service;

import java.util.Arrays;
import java.util.List;
import core.mate.academy.model.Excavator;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return Arrays.asList(
                new Excavator("E1", "White"),
                new Excavator("E2", "White"),
                new Excavator("E3", "White")
        );
    }
}
