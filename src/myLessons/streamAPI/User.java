package myLessons.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Karina", 28, "Kharkov"));
        users.add(new User("Bob", 30, "Kiev"));
        users.add(new User("Sem", 27, "Kharkov"));
        users.add(new User("Charlie", 35, "Paris"));
        users.add(new User("David", 40, "Berlin"));
        users.add(new User("Vadim", 31, "Kharkov"));
    }
}

