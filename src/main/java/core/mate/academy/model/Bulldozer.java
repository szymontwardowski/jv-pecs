package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeSize; // przykład pola specyficznego dla Bulldozera

    public Bulldozer() {
        super();
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
