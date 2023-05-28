package main.basicEgorov.collectionAndStream;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Person person1 = new Person("Mik",36);
        Person person2 = new Person("John",24);
        Person person3 = new Person("Liza",18);
        Person person4 = new Person("Karl",39);
        Person person5 = new Person("Jack",44);
        Person person6 = new Person("William",19);
        Person person7 = new Person("Sem",37);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

        System.out.println(persons);


        persons.stream()
                .map(el -> {
                    if (el.getAge() >35){
                        el.setName(el.getName().toUpperCase());
                    }
                    return el;
        })
                .forEach(System.out::println);

        System.out.println(persons);
    }

}
