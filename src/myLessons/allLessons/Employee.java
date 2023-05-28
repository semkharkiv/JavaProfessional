package myLessons.allLessons;

public class Employee {
    Employee(int id2, String surname2, int age2) {
        this(surname2, age2);
        id = id2;
        surname = surname2;
        age = age2;

    }

    Employee(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    Employee(String surname4, int age4, double salary4, String department4) {
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;

    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Abdullayev", 27);
        System.out.println(emp.surname);
        Employee emp2 = new Employee("Abdullayev", 27);
        System.out.println(emp2.surname + emp2.age);
        Employee emp3 = new Employee("Abdullaieva", 26, 3100, "HairExpert");
        System.out.println(emp3.surname + emp3.salary + emp3.age + emp3.department);
    }
}
