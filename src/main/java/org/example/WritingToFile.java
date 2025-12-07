package org.example;

import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;


/**
 * Класс предназначенный для записи объектов в файл в разных форматах
 */
public class WritingToFile {

    public void toTextFile(List<Car> cars, Path path) {
        Scanner scanner = new Scanner(System.in);

        try {
            if (Files.exists(path)) {
                System.out.println("Файл " + path.getFileName() + " уже существует");
                System.out.print("Добавить данные в конец? (да/нет): ");
                String answer = scanner.nextLine().trim().toLowerCase();

                if (answer.equals("да") || answer.equals("yes")) {
                    appendToFileText(cars, path);
                    System.out.println("Данные добавлены");
                } else {
                    System.out.println("Отмена записи");
                }
            } else {
                createFileText(cars, path);
                System.out.println("Файл успешно создан");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void createFileText(List<Car> cars, Path path) throws IOException {
        StringBuilder content = new StringBuilder();
        for (Car car : cars) {
            content.append(car.getPower()).append(",")
                    .append(car.getModel()).append(",")
                    .append(car.getYear()).append("\n");
        }
        Files.write(path, content.toString().getBytes());
    }

    private void appendToFileText(List<Car> cars, Path path) throws IOException {
        StringBuilder content = new StringBuilder();
        for (Car car : cars) {
            content.append(car.getPower()).append(",")
                    .append(car.getModel()).append(",")
                    .append(car.getYear()).append("\n");
        }
        Files.write(path, content.toString().getBytes(), StandardOpenOption.APPEND);
    }

    public void toJsonFile(List<Car> cars, Path path) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){

            try {
                if (Files.exists(path)) {
                    System.out.println("Файл " + path.getFileName() + " уже существует");
                    System.out.print("Добавить данные в конец? (да/нет): ");
                    String answer = scanner.nextLine().trim().toLowerCase();

                    if (answer.equals("да") || answer.equals("yes")) {
                        appendToFileJson(cars, path);
                        System.out.println("Данные добавлены");
                    } else {
                        System.out.println("Отмена записи");
                        flag = false;
                    }
                } else {
                    createFileJson(cars, path);
                    flag = false;
                    System.out.println("Файл успешно создан");
                }
            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public void createFileJson(List<Car> cars, Path path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(path.toFile(), cars);
    }

    private void appendToFileJson(List<Car> cars, Path path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String file = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(cars);
        Files.write(path, file.getBytes(),StandardOpenOption.APPEND);

    }
}
