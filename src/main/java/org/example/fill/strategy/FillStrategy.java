package org.example.fill.strategy;

import org.example.domain.Car;

import java.util.List;

public interface FillStrategy {
    List<Car> fill(List<Car> cars);
}
