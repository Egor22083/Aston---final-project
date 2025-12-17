package org.example;

import org.example.domain.Car;
import org.example.domain.CarBuilder;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ElementCounter {
    public static int countOccurrencesSimple(List<Car> list, Car target) {
        if (list == null || list.isEmpty() || target == null) {
            System.out.println("Количество вхождений: 0");
            return 0;
        }

        AtomicInteger counter = new AtomicInteger(0);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < list.size() / 2; i++) {
                if (list.get(i).equals(target)) {
                    counter.incrementAndGet();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = list.size() / 2; i < list.size(); i++) {
                if (list.get(i).equals(target)) {
                    counter.incrementAndGet();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        int result = counter.get();
        return result;
    }

}