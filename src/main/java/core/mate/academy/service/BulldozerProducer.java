package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final String BULLDOZER_NAME_1 = "Bulldozer1";
    private static final String BULLDOZER_NAME_2 = "Bulldozer2";
    private static final String BULLDOZER_COLOR_1 = "Yellow";
    private static final String BULLDOZER_COLOR_2 = "Orange";

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName(BULLDOZER_NAME_1);
        bulldozer1.setColor(BULLDOZER_COLOR_1);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName(BULLDOZER_NAME_2);
        bulldozer2.setColor(BULLDOZER_COLOR_2);

        return Arrays.asList(bulldozer1, bulldozer2);
    }
}
