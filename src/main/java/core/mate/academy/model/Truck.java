package core.mate.academy.model;

public class Truck extends Machine {
    public Truck(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getModel() + " is working");
    }
}
