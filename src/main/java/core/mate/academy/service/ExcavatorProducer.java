package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return Arrays.asList(
                new Excavator("B1", "Blue"),
                new Excavator("B2", "Red"),
                new Excavator("B3", "Yellow")
        );
    }
}
