package garage;

public class Car extends Pojazd {
    @Override
    public int obliczPłatnośćzaParkowanie() {
        return Math.toIntExact(koniecParkowania - startParkowania);
    }

    // TODO: 5: Dodaj pare pól by poćwiczyć skróty i generowanie getterów i setterów
    // TODO 6: Dziedziczenie i Interfejsy / Polimorfizm
    private String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getRegistrationNumber() {
        return licensePlate;
    }
}