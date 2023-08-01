package myLessons.autoTask;

import java.util.Objects;

public class Developer {
    private String name;
    private String surname;
    private int age;
    private double salary;
    private char sex;
    Car car;

    public Developer(String name, String surname, int age, double salary, char sex, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer developer)) return false;
        return age == developer.age && Double.compare(developer.salary, salary) == 0 && sex == developer.sex && Objects.equals(name, developer.name) && Objects.equals(surname, developer.surname) && Objects.equals(car, developer.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary, sex, car);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", sex=" + sex +
                ", car=" + car +
                '}';
    }
}
