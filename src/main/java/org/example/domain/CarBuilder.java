package org.example.domain;

public class CarBuilder {
    private Car car;
    private static CarBuilder instance = new CarBuilder();

    CarBuilder(){}

    public static CarBuilder name(String name){
        instance.car = new Car(name);
        return instance;
    }

    public CarBuilder power(double power){
        instance.car.setPower(power);
        return instance;
    }

    public CarBuilder year(int year){
        instance.car.setYear(year);
        return instance;
    }

    public Car build(){
        return this.car;
    }

}
