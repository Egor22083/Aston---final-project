package org.example.sortings.special;

import org.example.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SpecialMergeSort implements SpecialSort {

    public List<Car> sort(List<Car> cars) {
        int mid = cars.size() / 2;
        List<Car> left = new ArrayList<>();
        List<Car> right = new ArrayList<>();


        for (int i = 0; i < mid; i++) {
            left.add(cars.get(i));
        }

        for (int i = mid; i < cars.size(); i++) {
            right.add(cars.get(i));
        }
        ;

        if (left.size() >= 2)
            sort(left);

        if (right.size() >= 2)
            sort(right);

        return merge(cars, left, right);
    }

    private List<Car> merge(List<Car> cars, List<Car> left, List<Car> right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getYear() % 2 == 0) {
                if (left.get(i).getYear() <= right.get(j).getYear()) {
                    cars.set(k++, left.get(i++));
                } else {
                    cars.set(k++, right.get(j++));
                }
            } else {
                cars.set(k++, left.get(i++));
                if (right.get(j).getYear() % 2 != 0){
                    cars.set(k++, right.get(j++));
                }
            }
        }

            while (i < left.size()) {
                cars.set(k++, left.get(i++));
            }

            while (j < right.size()) {
                cars.set(k++, right.get(j++));
            }

            return cars;

    }

    private void swap(List<Car> cars, int i, int j){
        Car temp = cars.get(i);
        if (temp.getYear() % 2 == 0) {
            cars.set(i, cars.get(j));
            cars.set(j, temp);
        }
    }
}
