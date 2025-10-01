package core.mate.academy.model;

public class Bulldozer extends Machine {

    public Bulldozer() {
        super("Default Bulldozer", "Yellow");
    }

    public Bulldozer(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is plowing the field.");
    }
}
