package org.example;

import java.util.Scanner;

public class WorkingWithTheUser {

    private static final int EXIT_CHOICE = 2;
    private static final int FILL_IN_CHOICE = 3;
    private static final int RECORD_SELECTION_CHOICE = 2;
//    private static final int LENGTH_ARRAY_CHOICE = 2;
    private static final Scanner scanner = new Scanner(System.in);


    private int choiceExit(int choice){
        boolean flag = true;
        int exit = 0;
        while(flag){
            System.out.println("Ваш выбор " + choice + "\nХотите оставить или поменять:\n" +
                    "1. Оставить\n" +
                    "2. Поменять");
            exit = scanner.nextInt();
            if(exit > 2 || exit < 1){
                System.out.println("Вы ввели вариант, которого нет\n Пожалуйста, выберите из предложенных ");
            }else {
                flag = false;
            }

        }
        return exit;


    }

    public int choosingFillIn(){

        boolean flag = true;
        int choice = 0;
        while (flag) {
            System.out.println("Выберите способ ввода данных\n" +
                    "1. С файла\n" +
                    "2. В ручную\n" +
                    "3. Случайные данные");
            choice = scanner.nextInt();

            flag = choiceExit(choice) != 1;

        }
        return choice;
    }
    public int lengthArray(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        while (flag){
            System.out.println("Теперь введи размер создаваемого массива");
            length = scanner.nextInt();
            System.out.println("Ваш размер массива " + length + "\nХотите оставить или поменять:\n" +
                    "1. Оставить\n" +
                    "2. Поменять");
            int changes = scanner.nextInt();
            if(changes == 1){
                flag = false;
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
        Scanner scanner = new Scanner(System.in);
        int record = 0;
        while (flag){
            System.out.println("Ваш отсортированные данные готовы!\n" +
                    "В каком виде вы хотите их получить:\n" +
                    "1. JSON\n" +
                    "2. Текстовый вид");
            record = scanner.nextInt();

            flag = choiceExit(record) != 1;

        }
        return record;

    }
    public boolean isExit(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Хотите ли выйти из программы \n" +
                "1. Да\n" +
                "2. Нет");
        if(scanner.nextInt() ==1){
            exit = true;
        }
        return exit;
    }
}
