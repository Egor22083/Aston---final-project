package org.example.comparators.strategy.handlers;

import org.example.comparators.CompareByModel;
import org.example.domain.Car;

import java.util.Comparator;

public class ByModelHandler implements CompareHandler{
    @Override
    public Comparator<Car> get() {
        return new CompareByModel();
    }
}
