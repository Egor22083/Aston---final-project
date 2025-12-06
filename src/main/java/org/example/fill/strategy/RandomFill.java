package org.example.fill.strategy;

import org.example.Car;
import org.example.fill.FillOption;
import org.example.fill.rand.RandModels;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomFill implements FillStrategy {
    static final FillOption fillOption = FillOption.RANDOM;
    static private final double MIN_POWER = 10.0;
    static private final double MAX_POWER = 1000.0;
    static private final int MIN_YEAR = 1890;
    static private final int MAX_YEAR = 2025;
    static private final int MAX_COUNT_OF_MODELS = RandModels.values().length;

    @Override
    public List<Car> fill(List<Car> cars) {
        cars = cars
                .stream()
                .map(
                        (s) ->
                        {
                            double randomPower = Math.random() * (MAX_POWER - MIN_POWER) + MIN_POWER;
                            int randomYear = new Random().nextInt(MAX_YEAR - MIN_YEAR + 1) + MIN_YEAR;
                            String randomModel = RandModels
                                    .values()[new Random().nextInt(MAX_COUNT_OF_MODELS)]
                                    .toString();

                            return new Car(randomPower, randomModel, randomYear);
                        })
                .collect(Collectors.toList());
        return cars;
    }
}
