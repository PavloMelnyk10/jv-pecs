package core.mate.academy.model;

public class Truck extends Machine {
    private static final String START_WORK_MESSAGE = "Truck started to work";

    private int loadCapacity;

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println(START_WORK_MESSAGE);
    }
}
