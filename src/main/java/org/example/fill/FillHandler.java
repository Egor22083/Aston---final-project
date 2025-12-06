package org.example.fill;

import org.example.Car;
import org.example.fill.strategy.FillStrategy;

import java.util.List;

public class FillHandler {
    private FillStrategy fillStrategy;

    public FillHandler(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public List<Car> doFill(List<Car> cars) {
        return fillStrategy.fill(cars);
    }
}
