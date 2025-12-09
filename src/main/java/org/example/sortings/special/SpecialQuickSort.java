package org.example.sortings.special;

import org.example.domain.Car;

import java.util.List;

public class SpecialQuickSort implements SpecialSort {
    public List<Car> sort(List<Car> cars){
        return sort(cars, 0, cars.size() - 1);
    }

    public List<Car> sort(List<Car> cars, int left, int right){
        int l = left;
        int r = right;
        Car pivot = cars.get((left + right) / 2);

        while (l <= r) {
            while (l <= right) {
                if (cars.get(l).getYear() % 2 == 0) {
                    if (cars.get(l).getYear() < pivot.getYear()) {
                        l++;
                    } else break;
                }else{
                    l++;
                }
            }

            while (r >= left) {
                if (cars.get(r).getYear() % 2 == 0) {
                    if (cars.get(r).getYear() > pivot.getYear()) {
                        r--;
                    } else break;
                }else{
                    r--;
                }

            }

            if (l <= r) {
                swap(cars, l, r);
                l++;
                r--;
            }
        }

        if (l < right) {
            sort(cars, l, right);

        }
        if (r > left) {
            sort(cars, left, r);

        }

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
