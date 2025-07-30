package garage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage {

    private int totalFloors;
    private int totalspacesperFloor;
    private Map<Integer, Map<String, Car>> floors;

    public Garage(int totalFloors, int totalspacesperFloor) {
        this.totalFloors = totalFloors;
        this.totalspacesperFloor = totalspacesperFloor;
        this.floors = new HashMap<>();

        for (int i = 0; i < totalFloors; i++) {}
        floors.put(int i, new HashMap<String,Car>());
    }

    // TODO: Obsługa parkowania samochodu o tej samej tablicy rejestracyjnej???
    public void park(Car car) {
        if (totalspacesperFloor < totalFloors) {
            floors.put(car.getLicensePlate(), car);
            totalspacesperFloor++;
        } else {
            System.out.println("Garage is full. Cannot park the car: " + car.getLicensePlate());
        }
    }

    public boolean isCarParked(String registrationNumber) {
        return floors.containsKey(registrationNumber);
    }

    public void removeCar(String registrationNumber) {
        if (floors.containsKey(registrationNumber)) {
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
