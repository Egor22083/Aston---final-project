package org.example;


import org.example.fill.FillHandler;
import org.example.fill.strategy.FileFill;
import org.example.fill.strategy.ManualFill;
import org.example.fill.strategy.RandomFill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

////////////////////Неправильный Main!
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Collections.nCopies(4, null));

        //FillHandler fillHandler = new FillHandler(new ManualFill());
        //FillHandler fillHandler = new FillHandler(new FileFill());
        FillHandler fillHandler = new FillHandler(new RandomFill());

        //fillHandler.setFillStrategy(new ManualFill());
        //fillHandler.setFillStrategy(new FileFill());
        //fillHandler.setFillStrategy(new RandomFill());

        cars = fillHandler.doFill(cars);

        cars.forEach(System.out::println);
        System.out.println(cars.size());
    }
}