package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;
import java.util.Arrays;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(
                new Bulldozer("A1", "Yellow"),
                new Bulldozer("A2", "Blue"),
                new Bulldozer("A3", "Red")
        );
    }
}
