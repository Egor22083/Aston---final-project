package org.example;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkingWithTheUser {

    private static final int EXIT_CHOICE = 2;
    private static final int FILL_IN_CHOICE = 3;
    private static final int RECORD_SELECTION_CHOICE = 2;
    private static final int FIELDS_FOR_SORTING_CHOICE = 3;

    private static final Scanner scanner = new Scanner(System.in);


    private int choiceExit(int choice){
        boolean flag = true;
        int exit = 0;
        while(flag){
            try {

                System.out.println("Ваш выбор " + choice + "\nХотите оставить или поменять:\n" +
                        "1. Оставить\n" +
                        "2. Поменять");
                exit = scanner.nextInt();
                if(exit > EXIT_CHOICE || exit < 1){
                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                }else {
                    flag = false;
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели неправильный формат данных");
                scanner.next();
            }

        }
        return exit;


    }

    public int choosingFillIn(){

        boolean flag = true;
        int choice = 0;
        while (flag) {
            try {

                System.out.println("Выберите способ ввода данных\n" +
                        "1. С файла\n" +
                        "2. В ручную\n" +
                        "3. Случайные данные");
                choice = scanner.nextInt();
                if(choice > FILL_IN_CHOICE || choice < 1){
                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                }else{

                    flag = choiceExit(choice) != 1;
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели неправильный формат данных");
                scanner.next();
            }



        }
        return choice;
    }
    public int lengthArray(){
        boolean flag = true;
        int length = 0;
        while (flag){
            System.out.println("Теперь введи размер создаваемого массива");
            try{
            length = scanner.nextInt();

            flag = choiceExit(length) != 1;
            }catch (InputMismatchException e){
                System.out.println("Вы ввели неправильный формат данных");
                scanner.next();
            }

        }
        return length;

    }


    public void fillings(Car[] cars, int length){
        if(length == 1){
            //Логика для заполнения с файла
        }else if(length == 2){
            //Логика для заполнения в ручную

        }else if(length == 3){
            //Логика для заполнения рандомными данными
        }

    }

    public   int recordSelection(){
        boolean flag = true;
        int record = 0;
        while (flag){
            try {

                System.out.println("Ваш отсортированные данные готовы!\n" +
                        "В каком виде вы хотите их получить:\n" +
                        "1. JSON\n" +
                        "2. Текстовый вид");
                record = scanner.nextInt();
                if(record > RECORD_SELECTION_CHOICE || record < 0){
                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                }else {
                    flag = choiceExit(record) != 1;
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели неправильный формат данных");
                scanner.next();
            }


        }
        return record;

    }
    public boolean isExit(){
        boolean exit = false;
        System.out.println("Хотите ли выйти из программы \n" +
                "1. Да\n" +
                "2. Нет");
        if(scanner.nextInt() !=1){
            exit = true;
        }
        return exit;
    }


    public int selectingFieldsForSorting(){
        boolean flag = true;
        int field = 0;
        while (flag){
            try {

                System.out.println("По какому из полей хотите отсортировать:\n" +
                        "1. Мощность\n" +
                        "2. Модель\n" +
                        "3. Год производства");
                field = scanner.nextInt();
                if(field > FIELDS_FOR_SORTING_CHOICE || field < 0){
                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                }else {
                    flag = choiceExit(field) != 1;
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели неправильный формат данных");
                scanner.next();
            }


        }
        return field;
    }

    public void sortObjects(Car[] cars, int field){
        switch (field){
            case 1:
                //Сортировка по Мощности
                break;
            case 2:
                //Сортировка по Модели
                break;
            case 3:
                //Сортировка по Году производства
        }
    }


    public Path choosingPath(){
        boolean flag = true;
        String path = null;
        Path pathObj = null;
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (flag){

            System.out.println("Напишите путь, куда сохранить файл");

            path = scanner.nextLine().trim();
            pathObj = Paths.get(path);

            if (path.isEmpty()) {
                System.out.println("Путь не может быть пустым");
                continue;
            }
            if (!Files.exists(pathObj)) {
                System.out.println("Путь не существует: " + path);
                System.out.println("Пожалуйста, введите существующий путь.");
                continue;
            }

            flag = false;


        }
        return pathObj;
    }

    public String choosingFileName(){
        System.out.println("Введите название файла");

        return scanner.nextLine().trim();

    }

    public void recordCars(int record, Car[] cars){
        switch (record){
            case 1:
                //Json
            case 2:
                //текстовый файл
        }

    }
}
