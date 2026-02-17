package core.mate.academy.model;

public class Bulldozer extends Machine {
    public Bulldozer(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getModel() + " is working");
    }
}
