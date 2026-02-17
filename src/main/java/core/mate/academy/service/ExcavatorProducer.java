package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Komatsu PC210"));
        list.add(new Excavator("Caterpillar 320"));
        list.add(new Excavator("Volvo EC220E"));
        return list;
    }
}
