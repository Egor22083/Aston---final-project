package org.example.comparators.strategy.handlers;

import org.example.comparators.CompareByYear;
import org.example.domain.Car;

import java.util.Comparator;

public class ByYearHandler implements CompareHandler{
    @Override
    public Comparator<Car> get() {
        return new CompareByYear();
    }
}
