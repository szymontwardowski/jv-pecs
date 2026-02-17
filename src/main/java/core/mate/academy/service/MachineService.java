package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    <M extends T> List<M> getAll(Class<M> type);

    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends Machine> machines);
}
