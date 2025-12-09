package org.example.sortings.special;

import org.example.domain.Car;

import java.util.List;

public class SpecialBubbleSort implements SpecialSort {

    public List<Car> sort(List<Car> cars){
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 1; j < cars.size() - i; j++) {
                if (cars.get(i).getYear() < cars.get(j).getYear()){
                    if (cars.get(i).getYear() % 2 == 0)
                        swap(cars, i, j);
                }
            }
        }

        return cars;
    }

    private void swap(List<Car> cars, int i, int j){
        Car temp = cars.get(i);

        cars.set(i, cars.get(j));
        cars.set(j, temp);
    }
}
