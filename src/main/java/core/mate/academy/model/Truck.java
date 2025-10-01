package core.mate.academy.model;

public class Truck extends Machine {
    private double loadCapacity;

    public Truck() {
        super();
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
