package org.example;

/**
 * Класс-заглушка, чтобы не поломалась логика в Main
 */
public class Car {

    private double power;
    private String model;
    private int year;

    public Car(double power, String model, int year) {
        this.power = power;
        this.model = model;
        this.year = year;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
