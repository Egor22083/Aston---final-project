package org.example.sorting.special;

import org.example.domain.Car;

import java.util.List;

public class SpecialQuickSort implements SpecialSort {
    public List<Car> sort(List<Car> cars){
        return sort(cars, 0, cars.size() - 1);
    }

    public List<Car> sort(List<Car> cars, int left, int right){
        int l = left;
        int r = right;
        int pi = left;
        Car pivot = null;
        if (right - left > 1)
            do {
                pivot = cars.get(pi++);
            }while (pivot.getYear() % 2 != 0 && pi < cars.size());
        if (pivot == null)
            return cars;

        while (l <= r) {
            while (l <= right) {
                int year = cars.get(l).getYear();

                if (year % 2 != 0) {
                    l++;
                    continue;
                }

                if (year < pivot.getYear()) {
                    l++;
                } else {
                    break;
                }
            }

            while (r >= left) {
                int year = cars.get(r).getYear();

                if (year % 2 != 0) {
                    r--;
                    continue;
                }

                if (year > pivot.getYear()) {
                    r--;
                } else {
                    break;
                }
            }

            if (l <= r) {
                swap(cars, l, r);
                l++;
                r--;
            }
        }

        if (left < r) sort(cars, left, r);
        if (l < right) sort(cars, l, right);

        return cars;
    }

    private void swap(List<Car> cars, int l, int r){
        if (l <= r) {
            Car temp = cars.get(l);
            cars.set(l, cars.get(r));
            cars.set(r, temp);
        }
    }

}
