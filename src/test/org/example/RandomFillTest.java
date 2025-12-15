package org.example;

import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.rand.RandModels;
import org.example.fill.strategy.FillStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomFillTest {
    FillHandler fillHandler = new FillHandler();
    FillStrategy fillStrategy;

    @Test
    public void testRandomFill() {
        List<Car> actualCars = new ArrayList<>(Collections.nCopies(2, null));

        fillStrategy = fillHandler.get(FillOption.RANDOM);
        actualCars = fillStrategy.fill(actualCars);

        Assertions.assertTrue(Arrays
                .asList(RandModels.values())
                .stream()
                .map(s -> s.toString())
                .collect(Collectors.toUnmodifiableList())
                .contains(actualCars.get(0).getModel())
        );
    }
}
