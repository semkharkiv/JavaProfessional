package myLessons.autoTask;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Handler handler = new Handler();
        CopyWriter copyWriter = new CopyWriter();
        copyWriter.copyInfoInTxT(generator.generateDevelopers(5));
//        System.out.println(handler.getDeveloperAndMaxCarSpeed(generator.generateDevelopers(5)));

//        System.out.println(handler.getCarBySex(generator.generateDevelopers(5)));

//        System.out.println(handler.getDevelopersWithSportCar(generator.generateDevelopers(5)));

//        System.out.println(generator.generateDevelopers(5));
    }
}
