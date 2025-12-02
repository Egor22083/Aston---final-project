package org._jd;

import org.example.comparators.strategy.CompareStrategy;
import org.example.comparators.strategy.Comparisons;
import org.example.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1.1, "Иванова", 13));
        cars.add(new Car(1.0, "Иванькова", 16));
        cars.add(new Car(3.0, "Ivanova", 11));
        cars.add(new Car(6.2, "Иванов", 10));
        cars.add(new Car(4.0, "Иваньковоа", 12));
        cars.add(new Car(1.5, "Жук", 15));
        cars.add(new Car(2.0, "Як", 14));

        cars.stream().sorted(new CompareStrategy().get(Comparisons.BY_MODEL)).forEach(System.out::println);

    }
}