package core.mate.academy.model;

public class Truck extends Machine {
    public Truck(String name, String color) {
        super(name, color);
    }

    public Truck() {
        super("Default Truck", "Red");
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
