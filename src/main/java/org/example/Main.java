package org.example;


import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.strategy.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

////////////////////Неправильный Main!
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Collections.nCopies(2, null));

        FillHandler fillHandler = new FillHandler();
        FillStrategy fillStrategy;
        //fillStrategy = fillHandler.get(FillOption.JSON);
        //fillStrategy = fillHandler.get(FillOption.FILE);
        fillStrategy = fillHandler.get(FillOption.RANDOM);
        //fillStrategy = fillHandler.get(FillOption.MANUAL);

        cars = fillStrategy.fill(cars);

        cars.forEach(System.out::println);
        System.out.println(cars.size());
    }
}