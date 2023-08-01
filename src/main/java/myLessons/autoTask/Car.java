package myLessons.autoTask;

import java.util.Objects;

public class Car {
    private String color;
    private boolean isSport;
    private Brand brand;
    private int maxSpeed;

    public Car(String color, boolean isSport, Brand brand, int maxSpeed) {
        this.color = color;
        this.isSport = isSport;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return isSport == car.isSport && maxSpeed == car.maxSpeed && Objects.equals(color, car.color) && brand == car.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isSport, brand, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", isSport=" + isSport +
                ", brand=" + brand +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
