package org.example.fill;

import org.example.domain.Car;
import org.example.domain.CarBuilder;
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

        expectedCars.add(CarBuilder.name("Ford").year(1935).power(341.819).build());
        expectedCars.add(CarBuilder.name("BMW").year(1901).power(920.763).build());
        expectedCars.add(CarBuilder.name("BMW").year(1909).power(728.86).build());

        Assertions.assertEquals(actualCars, expectedCars);
    }

    @Test
    public void limitedTestFileFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.FILE);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(CarBuilder.name("Ford").year(1935).power(341.819).build());
        expectedCars.add(CarBuilder.name("BMW").year(1901).power(920.763).build());

        Assertions.assertEquals(actualCars, expectedCars);
    }
}


