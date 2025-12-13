package org.example;

import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.strategy.FillStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonFilllTest {
    FillHandler fillHandler = new FillHandler();
    FillStrategy fillStrategy;

    @Test
    public void testJsonFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(3, null));

        fillStrategy = fillHandler.get(FillOption.JSON);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(new Car(21, "w", 1990));
        expectedCars.add(new Car(22, "ww", 1990));
        expectedCars.add(new Car(23, "www", 1990));

        Assertions.assertEquals(actualCars, expectedCars);
    }

    @Test
    public void limitedTestJsonFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.JSON);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(new Car(21, "w", 1990));
        expectedCars.add(new Car(22, "ww", 1990));

        Assertions.assertEquals(actualCars, expectedCars);
    }
}
