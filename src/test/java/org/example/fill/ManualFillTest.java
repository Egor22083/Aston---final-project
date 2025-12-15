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

public class ManualFillTest {
    FillHandler fillHandler = new FillHandler();
    FillStrategy fillStrategy;

    @Test
    public void testManualFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.MANUAL);
        actualCars = fillStrategy.fill(actualCars);

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(CarBuilder.name("1").year(1).power(1).build());
        expectedCars.add(CarBuilder.name("2").year(2).power(2).build());

        Assertions.assertEquals(actualCars, expectedCars);
    }
}
