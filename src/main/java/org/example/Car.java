package org.example;


import java.util.Objects;

////////////////////Неправильный Car!
public class Car {
    private double power;
    private String model;
    private int year;

    public Car(double power, String model, int year) {
        this.power = power;
        this.model = model;
        this.year = year;
    }
    public Car() {

    }

    public double getPower() {
        return power;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(power, car.power) == 0 && year == car.year && Objects.equals(model, car.model);
    }
}
