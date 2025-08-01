package garage;

public abstract class Pojazd {

    protected long startParkowania;
    protected long koniecParkowania;
    private String licensePlate;

    public Pojazd(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract int obliczPłatnośćzaParkowanie();

    public void starttimer() {
        startParkowania = System.currentTimeMillis();
    }

    public void stoptheTimer() {
        koniecParkowania = System.currentTimeMillis();
    }
    public String getRegistrationNumber() {
        return licensePlate;
    }
}
// Kolejny typ pojazdu ciężarówka etc. z innym algorytmem liczenia płatności
