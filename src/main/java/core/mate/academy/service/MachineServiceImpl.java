package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @SuppressWarnings("unchecked")
    @Override
    public <M extends Machine> List<M> getAll(Class<M> type) {

        MachineProducer<M> producer;

        if (type == Bulldozer.class) {
            producer = (MachineProducer<M>) new BulldozerProducer();
        } else if (type == Excavator.class) {
            producer = (MachineProducer<M>) new ExcavatorProducer();
        } else if (type == Truck.class) {
            producer = (MachineProducer<M>) new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        return producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
