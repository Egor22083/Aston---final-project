package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Тест ElementCounter");

        // Тест A: Должен найти 2
        List<String> test1 = Arrays.asList("x", "y", "x");
        int r1 = ElementCounter.countOccurrencesSimple(test1, "x");
        System.out.println("Тест A: " + (r1 == 2 ? "OK" : "FAIL"));

        // Тест B: Пустой список = 0
        List<Integer> test2 = new ArrayList<>();
        int r2 = ElementCounter.countOccurrencesSimple(test2, 1);
        System.out.println("Тест B: " + (r2 == 0 ? "OK" : "FAIL"));

        // Тест C: Null проверка = 0
        int r3 = ElementCounter.countOccurrencesSimple(null, "test");
        System.out.println("Тест C: " + (r3 == 0 ? "OK" : "FAIL"));

        System.out.println("Если все три теста OK - задание выполнено!");
    }
}