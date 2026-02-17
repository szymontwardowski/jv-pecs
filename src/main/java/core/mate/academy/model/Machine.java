package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String model;

    public Machine() {
    }

    public Machine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
