package org._jd;

import org.example.domain.CarBuilder;
import org.example.domain.Car;
import org.example.sortings.SortingStrategy;
import org.example.sortings.special.SpecialBubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();

        cars.add(CarBuilder.name("1").year(13).power(100.0).build());
        cars.add(CarBuilder.name("2").year(10).power(99.9).build());

        cars.add(CarBuilder.name("3").year(15).power(13.1).build());
        cars.add(CarBuilder.name("4").year(8).power(18.6).build());


        cars.add(CarBuilder.name("5").year(11).power(18.5).build());
        cars.add(CarBuilder.name("5").year(4).power(18.5).build());

        cars.add(CarBuilder.name("5").year(5).power(18.5).build());
        cars.add(CarBuilder.name("5").year(6).power(18.5).build());

        SortingStrategy sortingStrategy = new SortingStrategy();

//        sortingStrategy.get(Sortings.MERGE, Comparisons.BY_YEAR).sort(cars).stream().forEach(System.out::println);
        System.out.println("============");

        new SpecialBubbleSort().sort(cars).stream().forEach(System.out::println);
        System.out.println("============");
//        new SpecialMergeSort().sort(cars).stream().forEach(System.out::println);
        System.out.println("============");
//        new SpecialQuickSort().sort(cars).stream().forEach(System.out::println);
    }
}