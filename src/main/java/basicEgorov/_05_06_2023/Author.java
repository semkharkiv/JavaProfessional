package basicEgorov._05_06_2023;

public class Author {
    private String name;
    private boolean sex;
    private int age;

    public Author(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
