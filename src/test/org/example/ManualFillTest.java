package org.example;

import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.strategy.FillStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManualFillTest {
    FillHandler fillHandler = new FillHandler();
    FillStrategy fillStrategy;

    @Test
    public void testManualFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.MANUAL);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(new Car(1, "1", 1));
        expectedCars.add(new Car(2, "2", 2));

        Assertions.assertEquals(actualCars, expectedCars);
    }
}
