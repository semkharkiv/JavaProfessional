package basicEgorov._15_08_23;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String address;
    private String email;
    private final int AGE_ADULT = 18;

    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        int name = this.name.compareTo(o.getName());
        if (name == 0) {
            return this.age - o.age;
        }
            return name;
    }

    public String getSummary(){
        return String.format("%s (%d) - [%s]", getName(), getAge(), getAddress());
    }

    public boolean isAdult(){
        return getAge() >= AGE_ADULT;
    }

    public void sendEmail(String massage){
        System.out.println("Sms send " + getEmail());
    }
}
