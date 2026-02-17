package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Volvo FH16"));
        list.add(new Truck("DAF XF"));
        list.add(new Truck("Mercedes Actros"));
        return list;
    }
}
