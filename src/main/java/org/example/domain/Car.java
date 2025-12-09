package org.example.domain;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private double power;
    private String model;
    private int year;

    Car(double power, String model, int year) {
        this.power = power;
        this.model = model;
        this.year = year;
    }

    Car(String model) {
        this.model = model;
        this.power = 0;
        this.year = 0;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(power, car.power) == 0 && year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, model, year);
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

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {

        final int FIRST_INDEX = 100;
        final int SECOND_INDEX = 10;
        final int THIRD_INDEX = 1;

        double resThis = this.power * FIRST_INDEX + this.year * SECOND_INDEX;
        byte[] modelBytes = this.model.getBytes();

        double resOther = o.power * FIRST_INDEX + o.year * SECOND_INDEX;
        byte[] oModelBytes = o.model.getBytes();

        double res = resThis - resOther;

        int len = modelBytes.length < oModelBytes.length ? modelBytes.length : oModelBytes.length;

        int stringRes = 0;
        for (int i = 0; i < len; i++) {
            if (modelBytes[i] != oModelBytes[i]) {
                stringRes += (modelBytes[i] - oModelBytes[i]) * THIRD_INDEX;
                break;
            }
        }

        if (stringRes == 0)
            stringRes = (modelBytes.length - oModelBytes.length) * THIRD_INDEX;

        return (int)(res + stringRes);
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
