package org.example.fill;

import org.example.domain.Car;
import org.example.domain.CarBuilder;
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
        expectedCars.add(CarBuilder.name("w").year(1990).power(21).build());
        expectedCars.add(CarBuilder.name("ww").year(1990).power(22).build());
        expectedCars.add(CarBuilder.name("www").year(1990).power(23).build());

        Assertions.assertEquals(actualCars, expectedCars);
    }

    @Test
    public void limitedTestJsonFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.JSON);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(CarBuilder.name("w").year(1990).power(21).build());
        expectedCars.add(CarBuilder.name("ww").year(1990).power(22).build());

        Assertions.assertEquals(actualCars, expectedCars);
    }
}
