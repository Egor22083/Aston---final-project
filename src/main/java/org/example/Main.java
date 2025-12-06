package org.example;


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


            Car[] cars = new Car[length];

            workingUser.fillings(cars, length);//Здесь происходит магия заполнения


            int record = workingUser.recordSelection();// Выбор в каком виде записать данные


            flag = workingUser.isExit();//Выйти из программы или нет





        }
        System.out.println("Спасибо, что выбрали нас!");
    }

}