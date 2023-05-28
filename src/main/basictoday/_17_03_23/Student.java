package main.basictoday._17_03_23;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human{
    private int classNumber;

    private List<EnumSUBJECT> studySab = new ArrayList<>();

    public List<EnumSUBJECT> getStudySab() {
        return studySab;
    }

    public void setStudySab(List<EnumSUBJECT> studySab) {
        this.studySab = studySab;
    }

    public Student(String name, int id, int classNumber) {
        super(name, id);
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classNumber=" + classNumber +
                ", studySab=" + studySab +
                "} " + super.toString();
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a student!");
    }
}
