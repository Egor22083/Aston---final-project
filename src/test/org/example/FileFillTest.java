package org.example;

import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.strategy.FillStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileFillTest {
    FillHandler fillHandler = new FillHandler();
    FillStrategy fillStrategy;

    @Test
    public void testFileFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(3, null));

        fillStrategy = fillHandler.get(FillOption.FILE);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(new Car(341.819, "Ford", 1935));
        expectedCars.add(new Car(920.763, "BMW", 1901));
        expectedCars.add(new Car(728.86, "BMW", 1909));

        Assertions.assertEquals(actualCars, expectedCars);
    }

    @Test
    public void limitedTestFileFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.FILE);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(new Car(341.819, "Ford", 1935));
        expectedCars.add(new Car(920.763, "BMW", 1901));

        Assertions.assertEquals(actualCars, expectedCars);
    }
}


