package core.mate.academy.model;

public abstract class Machine implements Workable {
    private final String model;

    public Machine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
