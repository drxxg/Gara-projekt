package garage;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Garage garage = new Garage(3, 2);
        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");
        Car car3 = new Car("LMN456");
        Car car4 = new Car("PQR321");
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        Thread.sleep(1058);
        garage.removePojazd("LMN456");
        garage.park(car4);
        garage.printZysk();
    }
//Thread.sleep nalicza czas
}