package org.example.fill.strategy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Car;
import org.example.fill.FillOption;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class JsonFill implements FillStrategy {
    private static final FillOption fillOption = FillOption.JSON;

    @Override
    public List<Car> fill(List<Car> cars) {
        int size = cars.size();
        try {
            cars = new ObjectMapper()
                    .readValue(new File("test.json"), new TypeReference<List<Car>>() {})
                    .stream()
                    .limit(size)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла!");
        }
        if (cars.size() < size) {
            System.out.println("Элементов в файле меньше чем в количестве запрашиваемом пользователем!");
        }
        return cars;
    }
}
