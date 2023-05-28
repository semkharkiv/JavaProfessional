package main.summaryFriday._28_04_2023;
//Создать класс Cat с полями
//String name
//int age
//String colour
//boolean isHungry
public class Cat {
    private String name;
    private int age;
    private String color;
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Cat(String name, int age, String color, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHungry = isHungry;
    }

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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isHungry=" + isHungry +
                '}';
    }
}
