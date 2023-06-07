package basicEgorov._05_06_2023;
//todo выяснить почему метод v1 не фильтрует лист по критериям
public class Main {
    public static void main(String[] args) {

        Gen gen = new Gen();
        System.out.println(gen.get());

        Service service = new Service(gen);

        System.out.println(service.m1(new Author("Author1",false,33), 1985));

    }
}