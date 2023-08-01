package myLessons.autoTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private static final String[] colors = {"Red", "Blue", "Green", "Yellow", "Black", "White"};



    public static final char[] genders = {'M', 'F'};

    private Random random = new Random();

    private Developer generateDeveloper() {
            String firstName = "Developer" + (random.nextInt(20));
            String lastName = "LastName" + (random.nextInt(20));
            int age = random.nextInt(38) + 20;
            double salary = random.nextDouble() * 5000 + 2000;
            char gender = genders[random.nextInt(genders.length)];
            Car car = generateCar();
            return new Developer(firstName, lastName, age, salary, gender, car);

    }

    private Car generateCar() {
            String color = colors[random.nextInt(colors.length)];
            boolean isSports = random.nextBoolean();
            Brand brand = getBrand();
            int speed = random.nextInt(200) + 100;
            return new Car(color,isSports,brand,speed);

    }

    private Brand getBrand(){
        int brandValues = Brand.values().length;
            int randomIndex = random.nextInt(brandValues);
            Brand randomCarBrand = Brand.values()[randomIndex];
        return randomCarBrand;
    }

    public List<Developer> generateDevelopers(int count){
        List<Developer> developers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            developers.add(generateDeveloper());
        }
        return developers;
    }
}
