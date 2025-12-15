package org.example.sorting;

import org.example.comparators.strategy.Comparisons;
import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.example.sortings.sorting.SortingStrategy;
import org.example.sortings.sorting.Sortings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    private final SortingStrategy strategy = new SortingStrategy();

    private List<Car> cars;

    @BeforeEach
    public void init(){
        cars = new ArrayList<>();
        cars.add(CarBuilder.name("1").year(13).power(100.0).build());
        cars.add(CarBuilder.name("2").year(10).power(99.9).build());
        cars.add(CarBuilder.name("3").year(15).power(13.1).build());
        cars.add(CarBuilder.name("4").year(8).power(18.6).build());
        cars.add(CarBuilder.name("5").year(11).power(18.5).build());
    }

    @DisplayName("Is first model 4 in quick sort")
    @Test
    public void testFirst(){
        List<Car> sorted = strategy.get(Sortings.QUICK, Comparisons.BY_YEAR).sort(cars);

        Assertions.assertEquals("4", sorted.get(0).getModel());
    }

    @DisplayName("Is last model 3 in quick sort")
    @Test
    public void testLast(){
        List<Car> sorted = strategy.get(Sortings.QUICK, Comparisons.BY_YEAR).sort(cars);

        Assertions.assertEquals("3", sorted.get(sorted.size() - 1).getModel());
    }
}
