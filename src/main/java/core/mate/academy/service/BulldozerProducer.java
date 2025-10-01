package core.mate.academy.service;

import java.util.Arrays;
import java.util.List;
import core.mate.academy.model.Bulldozer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(
                new Bulldozer("B1", "Yellow"),
                new Bulldozer("B2", "Yellow"),
                new Bulldozer("B3", "Yellow")
        );
    }
}
