package org.example.sortings.special;

import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.example.sortings.SortingStrategy;
import org.example.sortings.Sortings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SpecialBubbleSortTest {
    private final SpecialSortStrategy strategy = new SpecialSortStrategy();

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


    @DisplayName("Is first model 1 in special bubble")
    @Test
    public void testFirst(){
        List<Car> sorted = strategy.get(Sortings.BUBBLE).sort(cars);

        Assertions.assertEquals("1", sorted.get(0).getModel());
    }

    @DisplayName("Is second model 4 in special bubble")
    @Test
    public void testSecond(){
        List<Car> sorted = strategy.get(Sortings.BUBBLE).sort(cars);
        Assertions.assertEquals("4", sorted.get(1).getModel());
    }

    @DisplayName("Is 4nd model 2 in special bubble")
    @Test
    public void testThird(){
        List<Car> sorted = strategy.get(Sortings.BUBBLE).sort(cars);
        Assertions.assertEquals("2", sorted.get(3).getModel());
    }

}
