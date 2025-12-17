package org.example;

import org.example.console.OutputToTheConsole;
import org.example.domain.Car;

import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        WorkingWithTheUser workingUser = new WorkingWithTheUser();
        Scanner scanner = new Scanner(System.in);


        while(flag){
            int fieldForSorting = 0;
            String countElements = null;
            int count = 0;

            OutputToTheConsole.sayHello();

            scanner.nextLine();

            int choice = workingUser.choosingFillIn(); //Выбор способа заполнения
            int length = workingUser.lengthArray(); // Выбор размера массива


            List<Car> cars = new ArrayList<>(Collections.nCopies(length, null));

            cars = workingUser.fillings(cars, choice);//Здесь происходит магия заполнения

            if (cars.stream().noneMatch(Objects::isNull)) {
                int sortingMethod = workingUser.chooseSortingMethod();//Выбор метода для сортировки
                if(sortingMethod == 1 || sortingMethod == 2){

                    fieldForSorting = workingUser.selectingFieldsForSorting();//Выбор поля по которому сортировать
                }

                cars = workingUser.sortObjects(cars, fieldForSorting, sortingMethod);// Здесь происходит магия сортировки

                countElements = workingUser.selectingTheElementCount();//Сделать ли подсчет элементов

                if(countElements.equals("yes")|| countElements.equals("да")){
                    count = workingUser.countElement(cars);//Здесь выбираются поля и идет подсчет
                }

                int record = workingUser.recordSelection();// Выбор в каком виде записать данные

                Path path = workingUser.choosingPath();//выбор пути

                String fileName = workingUser.choosingFileName();//Выбор названия файла

                Path fullPath = path.resolve(fileName);
                System.out.println(fullPath);

                try {
                    workingUser.recordCars(record, cars, fullPath);//Запись в файл
                } catch (NullPointerException e) {
                    System.out.println("Ошибка при записе в файл");
                }
            }

            flag = workingUser.isExit();//Выйти из программы или нет
            fieldForSorting = 0;



        }
        System.out.println("Спасибо, что выбрали нас!");
    }

}