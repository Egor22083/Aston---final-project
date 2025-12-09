package org.example.comparators;

import org.example.domain.Car;

import java.util.Comparator;

public class SpecialCompare implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int res = 0;
        if (o1.getYear() % 2 != 0 && o2.getYear() % 2 != 0){
            res = o1.getYear() - o2.getYear();
        }
        return res;
    }
}
