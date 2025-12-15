package org.example.sortings.sorting;

import org.example.domain.Car;

import java.util.Comparator;
import java.util.List;

public class BubbleSort implements Sorting {

    private Comparator<Car> comparator;

    public List<Car> sort(List<Car> cars){
        for (int j = 1; j < cars.size(); j++) {
            for (int i = 0; i < cars.size() - 1; i++) {
                if (comparator != null) {
                    if (comparator.compare(cars.get(i), cars.get(j)) > 0) {
                        swap(cars, i, j);
                    }
                } else if (cars.get(i).compareTo(cars.get(j)) > 0){
                    swap(cars, i, j);
                }
            }
        }
        return cars;
    }

    public void setComparator(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    private void swap(List<Car> cars, int i, int j){

            Car temp = cars.get(i);
            cars.set(i, cars.get(j));
            cars.set(j, temp);


    }
}
