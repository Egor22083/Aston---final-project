package org.example.comparators.strategy;

import org.example.comparators.strategy.handlers.ByModelHandler;
import org.example.comparators.strategy.handlers.ByPowerHandler;
import org.example.comparators.strategy.handlers.ByYearHandler;
import org.example.comparators.strategy.handlers.CompareHandler;
import org.example.domain.Car;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CompareStrategy {
    private final Map<Comparisons, CompareHandler> handlerMap;

    public CompareStrategy() {
        this.handlerMap = new HashMap<>();
        init();
    }

    private void init(){
        handlerMap.put(Comparisons.BY_MODEL, new ByModelHandler());
        handlerMap.put(Comparisons.BY_POWER, new ByPowerHandler());
        handlerMap.put(Comparisons.BY_YEAR, new ByYearHandler());
    }

    public Comparator<Car> get(Comparisons comparison){
        return handlerMap.get(comparison).get();
    }
}
