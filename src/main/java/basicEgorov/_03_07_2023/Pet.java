package basicEgorov._03_07_2023;

public interface Pet {
    void say();
}

class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("dog say");
    }
}

class CAt implements Pet{

    @Override
    public void say() {
        System.out.println("cat say");
    }
}
