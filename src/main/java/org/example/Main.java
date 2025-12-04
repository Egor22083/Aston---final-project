package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Добро пожаловать в нашу программу!\n" +
                "Программа предназначена для сортировки классов\n" +
                "Приятного использования!");
        while(flag){
            int choice = choosingFillIn(); //Выбор способа заполнения
            int length = lengthArray(); // Выбор размера массива

            Car[] cars = new Car[length];

            fillings(cars, length);//Здесь происходит магия заполнения


            int record = recordSelection();// Выбор в каком виде записать данные


            boolean exit = isExit();//Выйти из программы или нет





        }
        System.out.println("Спасибо, что выбрали нас!");
    }
    public static int choosingFillIn(){

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (flag) {
            System.out.println("Выберите способ ввода данных\n" +
                    "1. С файла\n" +
                    "2. В ручную\n" +
                    "3. Случайные данные");
            choice = scanner.nextInt();
            System.out.println("Ваш выбор " + choice + "\nХотите оставить или поменять:\n" +
                    "1. Оставить\n" +
                    "2. Поменять");
            int changes = scanner.nextInt();
            if(changes == 1){
                flag = false;
            }
        }
        return choice;
    }
    public static int lengthArray(){
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


    public static void fillings(Car[] cars, int length){
        if(length == 1){
            //Логика для заполнения с файла
        }else if(length == 2){
            //Логика для заполнения в ручную

        }else if(length == 3){
            //Логика для заполнения рандомными данными
        }

    }

    public  static  int recordSelection(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int record = 0;
        while (flag){
            System.out.println("Ваш отсортированные данные готовы!\n" +
                    "В каком виде вы хотите их получить:\n" +
                    "1. JSON\n" +
                    "2. Текстовый вид");
            record = scanner.nextInt();
            System.out.println("Ваш выбор " + record + "\nХотите оставить или поменять:\n" +
                    "1. Оставить\n" +
                    "2. Поменять");
            int changes = scanner.nextInt();
            if(changes == 1){
                flag = false;
            }

        }
        return record;

    }
    public static boolean isExit(){
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