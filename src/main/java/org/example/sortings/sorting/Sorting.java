package org.example.sortings.sorting;

import org.example.domain.Car;

import java.util.Comparator;
import java.util.List;

public interface Sorting {
    void setComparator(Comparator<Car> comparator);

    List<Car> sort(List<Car> cars);
}
