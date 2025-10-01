package core.mate.academy.model;

public class Excavator extends Machine {

    public Excavator() {
        super("Default Excavator", "Blue");
    }

    public Excavator(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is digging.");
    }
}
