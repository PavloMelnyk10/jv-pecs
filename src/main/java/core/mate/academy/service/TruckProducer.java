package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final String TRUCK_NAME_1 = "Truck1";
    private static final String TRUCK_NAME_2 = "Truck2";
    private static final String TRUCK_COLOR_1 = "Red";
    private static final String TRUCK_COLOR_2 = "Black";

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName(TRUCK_NAME_1);
        truck1.setColor(TRUCK_COLOR_1);

        Truck truck2 = new Truck();
        truck2.setName(TRUCK_NAME_2);
        truck2.setColor(TRUCK_COLOR_2);

        return Arrays.asList(truck1, truck2);
    }
}
