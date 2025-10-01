package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends T> type);

    void fill(List<T> machines, T value);

    void startWorking(List<? extends T> machines);
}
