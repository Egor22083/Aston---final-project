package org.example;


import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Добро пожаловать в нашу программу!\n" +
                "Программа предназначена для сортировки классов\n" +
                "Приятного использования!");
        WorkingWithTheUser workingUser = new WorkingWithTheUser();
        while(flag){
            int choice = workingUser.choosingFillIn(); //Выбор способа заполнения
            int length = workingUser.lengthArray(); // Выбор размера массива


            List<Car> cars = new ArrayList<>();

            workingUser.fillings(cars, length);//Здесь происходит магия заполнения

            int fieldForSorting = workingUser.selectingFieldsForSorting();//Выбор поля по которому сортировать

            workingUser.sortObjects(cars, fieldForSorting);// Здесь происходит магия сортировки

            int record = workingUser.recordSelection();// Выбор в каком виде записать данные

            Path path = workingUser.choosingPath();//выбор пути

            String fileName = workingUser.choosingFileName();//Выбор названия файла

            Path fullPath = path.resolve(fileName);
            System.out.println(fullPath);
//
//
//            Car cars1 = new Car(3.2, "m1", 2000);
//            Car cars2 = new Car(4.2, "m2", 2001);
//            Car cars3 = new Car(5.2, "m3", 2002);
//            cars.add(cars1);
//            cars.add(cars2);
//            cars.add(cars3);



            workingUser.recordCars(record, cars, fullPath);//Запись в файл

            flag = workingUser.isExit();//Выйти из программы или нет



        }
        System.out.println("Спасибо, что выбрали нас!");
    }

}