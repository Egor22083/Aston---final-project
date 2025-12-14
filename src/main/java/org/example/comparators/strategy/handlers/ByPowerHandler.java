package org.example.comparators.strategy.handlers;

import org.example.comparators.CompareByPower;
import org.example.domain.Car;

import java.util.Comparator;

public class ByPowerHandler implements CompareHandler{
    @Override
    public Comparator<Car> get() {
        return new CompareByPower();
    }
}
