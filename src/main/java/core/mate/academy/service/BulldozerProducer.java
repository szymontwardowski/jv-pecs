package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Cat D6"));
        list.add(new Bulldozer("Komatsu D51"));
        list.add(new Bulldozer("Deere 700"));
        return list;
    }
}
