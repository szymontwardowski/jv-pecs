package core.mate.academy.model;

public abstract class Machine {
    private String model;
    private String color;

    public Machine() {}

    public Machine(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public abstract void doWork();

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
