package org.example.comparators;

import org.example.domain.Car;

import java.util.Comparator;

public class CompareByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}
