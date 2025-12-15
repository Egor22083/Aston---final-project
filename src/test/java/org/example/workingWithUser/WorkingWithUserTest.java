package org.example.workingWithUser;

import org.example.ElementCounter;
import org.example.WorkingWithTheUser;
import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithUserTest {
    @Test
    public void selectingTheElementCountTest() {
        WorkingWithTheUser workingWithTheUser = new WorkingWithTheUser();
        String expectedCount = "yes";
        String actualCount = workingWithTheUser.selectingTheElementCount();

        Assertions.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void countElementTest() {
        WorkingWithTheUser workingWithTheUser = new WorkingWithTheUser();

        List<Car> cars = new ArrayList<>();
        cars.add(CarBuilder.name("Ford").year(1935).power(341.819).build());
        cars.add(CarBuilder.name("BMW").year(1901).power(920.763).build());
        cars.add(CarBuilder.name("BMW").year(2010).power(710).build());
        cars.add(CarBuilder.name("BMW").year(2010).power(710).build());
        Car car = CarBuilder.name("BMW").year(2010).power(710).build();

        int expectedCount = ElementCounter.countOccurrencesSimple(cars, car);
        int actualCount = workingWithTheUser.countElement(cars);

        Assertions.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void fileFilingsTest() {
        WorkingWithTheUser workingWithTheUser = new WorkingWithTheUser();

        List<Car> targetCars = new ArrayList<>(Collections.nCopies(2, null));

        List<Car> expectedCars = new ArrayList<>();
        expectedCars.add(CarBuilder.name("Ford").year(1935).power(341.819).build());
        expectedCars.add(CarBuilder.name("BMW").year(1901).power(920.763).build());

        List<Car> actualCars = workingWithTheUser.fillings(targetCars, 1);
        int i = 0;
        Assertions.assertEquals(actualCars, expectedCars);
    }
}
