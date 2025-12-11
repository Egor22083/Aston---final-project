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

        while (i < left.size() && j < right.size()){
            boolean evenL = left.get(i).getYear() % 2 == 0;
            boolean evenR = right.get(j).getYear() % 2 == 0;

            if (evenL && evenR){
                if (left.get(i).getYear() <= right.get(j).getYear()){
                    cars.set(k++, left.get(i++));
                } else {
                    cars.set(k++, right.get(j++));
                }
            }
            else {
                cars.set(k++, left.get(i++));
                cars.set(k++, right.get(j++));
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
}
