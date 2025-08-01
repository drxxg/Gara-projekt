package garage;

import java.util.HashMap;
import java.util.Map;


public class Garage {

    public int totalFloors;
    private int spacesPerFloor;
    private int zyskzaParkowanie;
    private Map<Integer, Map<String, Pojazd>> floors;

    public Garage(int totalFloors, int spacesPerFloor) {
        this.totalFloors = totalFloors;
        this.spacesPerFloor = spacesPerFloor;
        this.floors = new HashMap<>();

        for (int i = 0; i < totalFloors; i++) {
            floors.put(i, new HashMap<String, Pojazd>());
        }
    }

    // TODO: Obsługa parkowania samochodu o tej samej tablicy rejestracyjnej???
    public void park(Pojazd car) {
        String plate = car.getRegistrationNumber();

        if (isPojazdParked(plate)) {
            System.out.println("Pojazd " + plate + " is already parked.");
            return;
        }

        for (int i = 0; i < totalFloors; i++) {
            Map<String, Pojazd> floorMap = floors.get(i);
            if (floorMap.size() < spacesPerFloor) {
                floorMap.put(plate, car);
                System.out.println("Parked car " + plate + " on floor " + i);
                car.starttimer();
                return;
            }
        }

        System.out.println("Garage is full. Cannot park the car: " + plate);
    }
// alt + crtl +l = format code
    public boolean isPojazdParked(String registrationNumber) {
        for (Map<String, Pojazd> floorMap : floors.values()) {
            if (floorMap.containsKey(registrationNumber)) {
                return true;
            }
        }
        return false;
    }

    public void removePojazd(String registrationNumber) {
        for (int i = 0; i < totalFloors; i++) {
            Map<String, Pojazd> floorMap = floors.get(i);
            if (floorMap.containsKey(registrationNumber)) {
               Pojazd car = floorMap.remove(registrationNumber);
                System.out.println("Removed car " + registrationNumber + " from floor " + i);
                car.stoptheTimer();
                zyskzaParkowanie = zyskzaParkowanie + car.obliczPłatnośćzaParkowanie();
                return;
            }
        }
        System.out.println("Pojazd with registration number " + registrationNumber + " not found in the garage.");
    }

    public int getAvailableSpaces() {
        int used = 0;
        for (Map<String, Pojazd> floorMap : floors.values()) {
            used += floorMap.size();
        }
        int capacity = totalFloors * spacesPerFloor;
        return capacity - used;
    }

    public void printZysk() {
        System.out.println("Zysk całkowity wynosi " + zyskzaParkowanie + "zł");
    }

    // TODO: Zastanów się jak dodać godzinę o której zaczęto parkowanie + metoda informująca o czasie parkowania dla danej tablicy rejestracyjnej w godiznach

}
