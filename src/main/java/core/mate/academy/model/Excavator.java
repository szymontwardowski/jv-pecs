package core.mate.academy.model;

public class Excavator extends Machine {
    public Excavator(String name, String color) {
        super(name, color);
    }

    public Excavator() {
        super("Default Excavator", "White");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
