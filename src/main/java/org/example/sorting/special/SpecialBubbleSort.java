package org.example.sorting.special;

import org.example.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class SpecialBubbleSort implements SpecialSort {

    public List<Car> sort(List<Car> cars){
        List<Car> evens = new ArrayList<>();
        List<Integer> evenIndexes = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() % 2 == 0){
                evens.add(car);
                evenIndexes.add(cars.indexOf(car));
            }
        }

        for (int i = 0; i < evens.size(); i++) {
            for (int j = 0; j < evens.size() - 1 - i; j++) {
                Car c1 = evens.get(j);
                Car c2 = evens.get(j + 1);

                if (c1.getYear() > c2.getYear())
                    swap(evens, j, j + 1);
            }
        }

        int i = 0;
        int k = 0;
        while (i < cars.size()){
            if (evenIndexes.contains(i)){
                cars.set(i++, evens.get(k++));
            } else i++;
        }

        return cars;
    }

    private void swap(List<Car> cars, int i, int j){
        Car temp = cars.get(i);

        cars.set(i, cars.get(j));
        cars.set(j, temp);
    }
}
