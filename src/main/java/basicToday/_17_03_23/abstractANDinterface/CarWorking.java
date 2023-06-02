package basicToday._17_03_23.abstractANDinterface;
//Пример default метода в интерфейсе (по примеру абстрактного)
public interface CarWorking {
    default void washCar(Object car){
        System.out.println("Wash car for a " + car.toString());
    }


    default void service(Object car){
        System.out.println("Common service for a car " + car.toString());
    }
}
