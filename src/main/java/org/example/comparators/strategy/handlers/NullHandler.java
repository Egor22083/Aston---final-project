package org.example.comparators.strategy.handlers;

import org.example.domain.Car;

import java.util.Comparator;

public class NullHandler implements CompareHandler{
    @Override
    public Comparator<Car> get() {
        return null;
    }
}
