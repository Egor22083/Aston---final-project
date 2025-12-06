package org.example.fill.strategy;

import org.example.Car;
import org.example.fill.FillOption;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManualFill implements FillStrategy {
    static final FillOption fillOption = FillOption.MANUAL;

    @Override
    public List<Car> fill(List<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        cars = cars
                .stream()
                .map(
                        (s) ->
                        {
                            double power = 0;
                            String model = "";
                            int year = 0;

                            System.out.println("Введите мощность:");
                            try {
                                power = scanner.nextDouble();
                            } catch (InputMismatchException e) {
                                System.out.println("Некорректный ввод, в значение мощности присвоен 0!");
                            }
                            scanner.nextLine();

                            System.out.println("Введите модель:");
                            try {
                                model = scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Некорректный ввод, в значение модели присвоена пустая строка!");
                            }

                            System.out.println("Введите год:");
                            try {
                                year = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Некорректный ввод, в значение года присвоен 0!");
                            }
                            scanner.nextLine();

                            return new Car(power, model, year);
                        })
                .collect(Collectors.toList());
        scanner.close();
        return cars;

    }
}
