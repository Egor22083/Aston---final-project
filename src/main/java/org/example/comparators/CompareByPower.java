package org.example.comparators;

import org.example.domain.Car;

import java.util.Comparator;

public class CompareByPower implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPower() < o2.getPower() ? -1 : o1.getPower() > o2.getPower() ? 1 : 0;
    }
}
