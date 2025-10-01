package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Machine() {
        this("Default", "Default");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
