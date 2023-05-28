package main.basicEgorov.homework.Hw.friendsTask;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person friend1 = new Person("Nik");
        Person friend2 = new Person("Floyd");
        Person friend3 = new Person("Leo");
        Person friend4 = new Person("Klara");
        Person friend5 = new Person("Liana");
        Person friend6 = new Person("Leo");
        Person friend7 = new Person("Jim");
        Person friend8 = new Person("Rob");
        Person friend9 = new Person("Arjen");
        Person friend10 = new Person("Wesley");
        Person friend11 = new Person("Wesley");

        List<Person> persons =Arrays.asList(
                new Person("Michael",Arrays.asList(friend4,friend5,friend6)),
                new Person("Henry",Arrays.asList(friend7,friend2,friend5,friend3)),
                new Person("Mark",Arrays.asList(friend1,friend4,friend5,friend9)),
                new Person("Lara",Arrays.asList(friend7,friend8,friend10,friend4)),
                new Person("John",Arrays.asList(friend4,friend5,friend9,friend10,friend1)));

        System.out.println(findMaxCommonFriends(persons));


    }
    public static List<Person> findMaxCommonFriends(List<Person> persons){

         persons.stream()
                .flatMap(p1 -> persons.stream().skip(persons.indexOf(p1) + 1)
                        .map(p2 -> new AbstractMap.SimpleEntry<List<Person>, Long>(List.of(p1, p2), p1.getFriends().stream().
                                filter(el -> p2.getFriends().contains(el)).count()) {
                        }))
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue())).filter(el -> el.getValue() > 0)
                .forEach(System.out::println);


        return persons;
    }
}
