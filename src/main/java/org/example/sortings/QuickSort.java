package org.example.sortings;

import org.example.domain.Car;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class QuickSort implements Sorting {
    private Comparator<Car> comparator;

    public List<Car> sort(List<Car> cars){
        return sort(cars, 0, cars.size() - 1);
    }

    public List<Car> sort(List<Car> cars, int left, int right){
        int l = left;
        int r = right;
        Car pivot = cars.get((left + right) / 2);

        while (l <= r) {
            while (l <= right) {
                if (comparator != null) {
                    if (comparator.compare(cars.get(l), pivot) < 0) {
                        l++;
                    } else break;
                }else if (cars.get(l).compareTo(pivot) < 0){
                    l++;
                }
                else break;
            }

            while (r >= left) {
                if (comparator != null) {
                    if (comparator.compare(cars.get(r), pivot) > 0) {
                        r--;
                    } else break;
                }else if (cars.get(r).compareTo(pivot) > 0){
                    r--;
                }
                else break;
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

    public void setComparator(Comparator<Car> comparator) {
        this.comparator = comparator;
    }
}
