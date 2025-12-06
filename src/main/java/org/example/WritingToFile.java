package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Класс предназначенный для записи объектов в файл в разных форматах
 */
public class WritingToFile {

    public void toTextFile(Car[] cars, Path path) {
        Scanner scanner = new Scanner(System.in);

        try {
            if (Files.exists(path)) {
                System.out.println("Файл " + path.getFileName() + " уже существует");
                System.out.print("Добавить данные в конец? (да/нет): ");
                String answer = scanner.nextLine().trim().toLowerCase();

                if (answer.equals("да") || answer.equals("yes")) {
                    appendToFile(cars, path);
                    System.out.println("Данные добавлены");
                } else {
                    System.out.println("Отмена записи");
                }
            } else {
                createFile(cars, path);
                System.out.println("Файл успешно создан");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void createFile(Car[] cars, Path path) throws IOException {
        StringBuilder content = new StringBuilder();
        for (Car car : cars) {
            content.append(car.getPower()).append(",")
                    .append(car.getModel()).append(",")
                    .append(car.getYear()).append("\n");
        }
        Files.write(path, content.toString().getBytes());
    }

    private void appendToFile(Car[] cars, Path path) throws IOException {
        StringBuilder content = new StringBuilder();
        for (Car car : cars) {
            content.append(car.getPower()).append(",")
                    .append(car.getModel()).append(",")
                    .append(car.getYear()).append("\n");
        }
        Files.write(path, content.toString().getBytes(), StandardOpenOption.APPEND);
    }
}
