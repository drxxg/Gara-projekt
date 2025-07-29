package garage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage {

    private int totalSpaces;
    private int occupiedSpaces;
    // TODO 7: Może dołożyć piętra w garażu?
    private Map<String, Car> carMap;

    public Garage(int totalSpaces) {
        this.totalSpaces = totalSpaces;
        this.occupiedSpaces = 0;
        this.carMap = new HashMap<>();
    }

    // TODO: Obsługa parkowania samochodu o tej samej tablicy rejestracyjnej???
    public void park(Car car) {
        if (occupiedSpaces < totalSpaces) {
            carMap.put(car.getLicensePlate(), car);
            occupiedSpaces++;
        } else {
            System.out.println("Garage is full. Cannot park the car: " + car.getLicensePlate());
        }
    }

    public boolean isCarParked(String registrationNumber) {
        return carMap.containsKey(registrationNumber);
    }

    public void removeCar(String registrationNumber) {
        if (carMap.containsKey(registrationNumber)) {
            occupiedSpaces--;
            carMap.remove(registrationNumber);
        } else {
            System.out.println("Car with registration number " + registrationNumber + " not found in the garage.");
        }
    }

    public int getAvailableSpaces() {
        return totalSpaces - occupiedSpaces;
    }

    // TODO: Zastanów się jak dodać godzinę o której zaczęto parkowanie + metoda informująca o czasie parkowania dla danej tablicy rejestracyjnej w godiznach

}
