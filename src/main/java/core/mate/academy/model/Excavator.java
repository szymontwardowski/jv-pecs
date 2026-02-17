package core.mate.academy.model;

public class Excavator extends Machine {
    public Excavator(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getModel() + " is working");
    }
}
