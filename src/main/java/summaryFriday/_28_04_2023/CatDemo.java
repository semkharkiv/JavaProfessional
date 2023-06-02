package summaryFriday._28_04_2023;

import java.util.ArrayList;
import java.util.List;

//Создать список из экземплянов класса Cat. С помощью стримов:
//- вывести список голодных кошек старше 2 лет
//- вывести список черных кошек с именем, начинающимся на T
//- вывести список имен кошек возраста 1 год
public class CatDemo {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();

        Cat cat1 = new Cat("Jane", 5, "Brown", true);
        Cat cat2 = new Cat("Garfield", 1, "Yellow", false);
        Cat cat3 = new Cat("Tom", 7, "Black", true);
        Cat cat4 = new Cat("Mark", 1, "White", false);
        Cat cat5 = new Cat("Lucky", 4, "Black", true);

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);

        List<Cat> hungryCatsOver2YearsOld = catList.stream()
                .filter(cat -> cat.getAge() > 2 && cat.isHungry())
                .toList();
        System.out.println("List of hungry cats over 2 years old - " + hungryCatsOver2YearsOld);

        List<Cat> blackCatsWithStartingNameWIthT = catList.stream()
                .filter(cat -> cat.getColor() == "Black" && cat.getName().startsWith("T"))
                .toList();
        System.out.println("List of black cats with name starting with T - " + blackCatsWithStartingNameWIthT);

        List<String> catsOneYearsOld = catList.stream()
                .filter(cat -> cat.getAge() == 1)
                .map(Cat::getName)
                .toList();

        System.out.println("Cats that are 1 year old - " + catsOneYearsOld);

    }


}
