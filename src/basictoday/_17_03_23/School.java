package basictoday._17_03_23;

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Thomson", 1, EnumSUBJECT.MATH);
        Teacher teacher2 = new Teacher("Mrs Clark",2,EnumSUBJECT.GEOGRAPHY);
        Student student = new Student("Sem", 4, 2);

        teacher.sayHello();
        teacher.introduceYourself();

        student.sayHello();
        student.introduceYourself();

        teacher.teach(student);
        Cat cat = new Cat("Tom");
        restTime(teacher,student,cat);

        Student student2 = new Student("Vitalii",2,5);
        Student student3 = new Student("Kolya",4,5);
        Student student4 = new Student("Olga",1,5);

        Student[] class6Student = {student2,student3,student4};
        teacher2.teach(class6Student);
        System.out.println(student2);

    }

    private static void restTime(Playable ... players) {
    for(Playable p: players){
        p.play();
    }

    }
}
