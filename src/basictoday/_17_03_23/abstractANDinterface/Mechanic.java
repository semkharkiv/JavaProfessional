package basictoday._17_03_23.abstractANDinterface;

public class Mechanic  {

    public void service(Car car) {
        car.commonService();
        car.washCar();
        car.specialService();
    }

    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();

        BMW bmw = new BMW();
        BMW bmw2 = new BMW2();
        TESLA tesla = new TESLA();
        NISSAN nissan = new NISSAN();

        mechanic.service(bmw);
        System.out.println("-------");
        mechanic.service(bmw2);
        System.out.println("-------");
        mechanic.service(tesla);
        System.out.println("-------");
        mechanic.service(nissan);
        System.out.println("-------");

    }
}
