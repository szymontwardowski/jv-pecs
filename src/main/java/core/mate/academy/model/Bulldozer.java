package core.mate.academy.model;

public class Bulldozer extends Machine {
    public Bulldozer() {
        super("Bulldozer", "Yellow");
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
