package org.example.comparators;

import org.example.domain.Car;

import java.util.Comparator;

public class CompareByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        byte[] o1bytes = o1.getModel().getBytes();
        byte[] o2bytes = o2.getModel().getBytes();

        int len = o1bytes.length < o2bytes.length ? o1bytes.length : o2bytes.length;

        for (int i = 0; i < len; i++) {
            if (o1bytes[i] != o2bytes[i]){
                return o1bytes[i] - o2bytes[i];
            }
        }
        return o1bytes.length - o2bytes.length;
    }
}
