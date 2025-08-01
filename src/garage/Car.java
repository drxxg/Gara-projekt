package garage;

public class Car extends Pojazd {
    @Override
    public int obliczPłatnośćzaParkowanie() {
        return Math.toIntExact(koniecParkowania - startParkowania);
    }

    // TODO: 5: Dodaj pare pól by poćwiczyć skróty i generowanie getterów i setterów
    // TODO 6: Dziedziczenie i Interfejsy / Polimorfizm

    public Car(String licensePlate) {
        super(licensePlate);
    }

}