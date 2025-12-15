package org.example.comparators.strategy.handlers;

import org.example.domain.Car;

import java.util.Comparator;

public interface CompareHandler {
    Comparator<Car> get();
}
