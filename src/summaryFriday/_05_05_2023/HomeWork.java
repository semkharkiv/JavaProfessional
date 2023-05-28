package summaryFriday._05_05_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HomeWork {
    static class Cat {
        String name;
        int age;
        String color;
        boolean hungry;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isHungry() {
            return hungry;
        }

        public void setHungry(boolean hungry) {
            this.hungry = hungry;
        }

        public Cat(String name, int age, String color, boolean hungry) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.hungry = hungry;
        }
    }
    public static void main(String[] args) {


        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        Cat cat6 = new Cat("Mary", 3, "black", false);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5,cat6);


        // 1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
        // 2. Получить Map<String, Long> цвет / количество кошек данного цвета
        // 3. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
        // 4. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста

        //1
        Map<String, Boolean> collectNameAndIsHungry = catList.stream().collect(Collectors.toMap(Cat::getName, Cat::isHungry));
        System.out.println(collectNameAndIsHungry);
        //2
        Map<String, Long> collectColorAndCount = catList.stream().collect(Collectors
                .groupingBy(Cat::getColor, Collectors.counting()));
        System.out.println(collectColorAndCount);
        //3
        Map<String, List<String>> collectColorAndName = catList.stream().collect(Collectors.groupingBy(Cat::getColor, Collectors.mapping(Cat::getName, Collectors.toList())));
        System.out.println(collectColorAndName);
        //4
        Map<Integer, Integer> collectAgeAndIsHungry = catList.stream().collect(Collectors.toMap(Cat::getAge, cat -> {
            return cat.isHungry() ? 1 : 0;
        }, Integer::sum));
        System.out.println(collectAgeAndIsHungry);
    }


}

