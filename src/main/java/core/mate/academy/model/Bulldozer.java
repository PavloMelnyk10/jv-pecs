package core.mate.academy.model;

public class Bulldozer extends Machine {
    private static final String START_WORK_MESSAGE = "Bulldozer started to work";

    private String trackType;

    public Bulldozer() {
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getTrackType() {
        return trackType;
    }

    @Override
    public void doWork() {
        System.out.println(START_WORK_MESSAGE);
    }
}
