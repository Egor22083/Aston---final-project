package org.example.fill.strategy;


import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.example.fill.FillOption;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileFill implements FillStrategy {
    static final FillOption fillOption = FillOption.FILE;

    @Override
    public List<Car> fill(List<Car> cars) {

        int size = cars.size();
        try {
            cars = Files
                    .lines(Paths.get("test.txt"))
                    .map(line -> line.split(","))
                    .map(parts -> CarBuilder
                            .name(parts[1].trim())
                            .year(Integer.parseInt(parts[2].trim()))
                            .power(Double.parseDouble(parts[0].trim()))
                            .build()
                    )
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
