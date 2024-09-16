package core.mate.academy.model;

public class Excavator extends Machine {
    private static final String START_WORK_MESSAGE = "Excavator started to work";

    private int bucketCapacity;

    public Excavator() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println(START_WORK_MESSAGE);
    }
}
