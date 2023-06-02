package basicEgorov.homework.Hw.friendsTask;

import java.util.List;
import java.util.Objects;

//Дана коллекция объектов класса Person, содержащая поля name и список
//     * friends, представляющий список друзей данного человека. Напишите метод,
//     * который находит двух людей в коллекции, у которых максимальное число общих друзей.
//     * Если таких людей несколько, то вернуть список их имен.
public class Person {
    private String name;
    private List<Person> friends;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return name.equals(person.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friends);
    }

    public Person(String name, List<Person> friends) {
        this.name = name;
        this.friends = friends;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
