package basictoday._17_03_23.abstractANDinterface;

public abstract class Car {
    public void commonService(){
        System.out.println("Common service for a car");
    }

    public void washCar(){
        System.out.println("Washing a car");
    }

    public abstract void specialService();
}
