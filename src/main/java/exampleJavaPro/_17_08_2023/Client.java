package exampleJavaPro._17_08_2023;

import java.time.LocalDate;
import java.util.UUID;

public class Client {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String surname;
    private LocalDate dateBirth;
    public void setName(String name) {
        if (name == null) {throw new NullPointerException();}
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null) {throw new NullPointerException();}
        this.surname = surname;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getId() {
        return id;
    }

    public boolean isAdult(LocalDate dateCurrent){
        if (dateCurrent == null) {throw new NullPointerException();}
        return dateBirth.isBefore(dateCurrent.minusYears(18));
    }
}
