package basictoday._17_03_23;

import java.util.List;

public class Teacher extends Human {

    //    private String subject;
    private EnumSUBJECT enumSUBJECT;

    public Teacher(String name, int id, EnumSUBJECT enumSUBJECT) {
        super(name, id);
        this.enumSUBJECT = enumSUBJECT;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a teacher!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, dear students!");
    }

    public void teach(Student student) {
        System.out.println("Teacher " + this.getName() + " teaches " + student.getName() + " Subject: " + enumSUBJECT);
        List<EnumSUBJECT> enumSUBJECTS = student.getStudySab();
        if (!enumSUBJECTS.contains(enumSUBJECTS)){
            student.getStudySab().add(enumSUBJECT);
        }
    }

    public void teach(Student[] students) {
        for (Student s : students) {
            this.teach(s);
        }
    }
}
