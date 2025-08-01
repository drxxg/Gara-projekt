package garage;

import java.util.HashMap;
import java.util.Map;


public class Garage {

    public int totalFloors;
    private int spacesPerFloor;
    private Map<Integer, Map<String, Car>> floors;

    public Garage(int totalFloors) {
        this.totalFloors    = totalFloors;
        this.spacesPerFloor = spacesPerFloor;
        this.floors         = new HashMap<>();

        for (int i = 0; i < totalFloors; i++) {
            floors.put(i, new HashMap<String, Car>());
        }
    }

    // TODO: Obsługa parkowania samochodu o tej samej tablicy rejestracyjnej???
    public void park(Car car) {
        String plate = car.getRegistrationNumber();

        if (isCarParked(plate)) {
            System.out.println("Car " + plate + " is already parked.");
            return;
        }

        for (int i = 0; i < totalFloors; i++) {
            Map<String, Car> floorMap = floors.get(i);
            if (floorMap.size() < spacesPerFloor) {
                floorMap.put(plate, car);
                System.out.println("Parked car " + plate + " on floor " + i);
                return;
            }
        }

        System.out.println("Garage is full. Cannot park the car: " + plate);
    }

public boolean isCarParked(String registrationNumber) {
    for (Map<String, Car> floorMap : floors.values()) {
        if (floorMap.containsKey(registrationNumber)) {
            return true;
        }
    }
    return false;
}

public void removeCar(String registrationNumber) {
    for (int i = 0; i < totalFloors; i++) {
        Map<String, Car> floorMap = floors.get(i);
        if (floorMap.containsKey(registrationNumber)) {
            floorMap.remove(registrationNumber);
            System.out.println("Removed car " + registrationNumber + " from floor " + i);
            return;
        }
    }
    System.out.println("Car with registration number " + registrationNumber + " not found in the garage.");
}

public int getAvailableSpaces() {
    int used = 0;
    for (Map<String, Car> floorMap : floors.values()) {
        used += floorMap.size();
    }
    int capacity = totalFloors * spacesPerFloor;
    return capacity - used;
}

    // TODO: Zastanów się jak dodać godzinę o której zaczęto parkowanie + metoda informująca o czasie parkowania dla danej tablicy rejestracyjnej w godiznach

}
