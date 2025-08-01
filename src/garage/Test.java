package garage;

public class Test {

    public static void main(String[] args) {
        Garage garage = new Garage(3);
        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");
        Car car3 = new Car("LMN456");
        Car car4 = new Car("PQR321");
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.removeCar("LMN456");
        garage.park(car4);
    }}