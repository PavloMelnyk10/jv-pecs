package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final String EXCAVATOR_NAME_1 = "Excavator1";
    private static final String EXCAVATOR_NAME_2 = "Excavator2";
    private static final String EXCAVATOR_COLOR_1 = "Blue";
    private static final String EXCAVATOR_COLOR_2 = "Green";

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName(EXCAVATOR_NAME_1);
        excavator1.setColor(EXCAVATOR_COLOR_1);

        Excavator excavator2 = new Excavator();
        excavator2.setName(EXCAVATOR_NAME_2);
        excavator2.setColor(EXCAVATOR_COLOR_2);

        return Arrays.asList(excavator1, excavator2);
    }
}
