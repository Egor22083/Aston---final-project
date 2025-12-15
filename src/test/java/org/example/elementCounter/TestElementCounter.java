package org.example.elementCounter;

import org.example.ElementCounter;
import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestElementCounter {

    @Test
    public void testCounter1() {
        List<Car> cars = new ArrayList<>();
        cars.add(CarBuilder.name("Ford").year(1935).power(120).build());
        cars.add(CarBuilder.name("BMW").year(1909).power(270).build());
        cars.add(CarBuilder.name("BMW").year(1909).power(270).build());

        Car car = CarBuilder.name("BMW").year(1909).power(270).build();

        int actualResult = ElementCounter.countOccurrencesSimple(cars, car);
        int expectedResult = 2;

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCounter2() {
        List<Car> cars = new ArrayList<>();
        cars.add(CarBuilder.name("Ford").year(1935).power(120).build());
        cars.add(CarBuilder.name("BMW").year(1909).power(270).build());
        cars.add(CarBuilder.name("BMW").year(1909).power(270).build());

        Car car = CarBuilder.name("Audi").year(2000).power(270).build();

        int actualResult = ElementCounter.countOccurrencesSimple(cars, car);
        int expectedResult = 0;

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCounter3() {
        List<Car> cars = new ArrayList<>();
        Car car = CarBuilder.name("Audi").year(2000).power(270).build();

        int actualResult = ElementCounter.countOccurrencesSimple(cars, car);
        int expectedResult = 0;

        Assertions.assertEquals(actualResult, expectedResult);
    }
}