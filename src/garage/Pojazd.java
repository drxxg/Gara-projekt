package garage;

public abstract class Pojazd {

    protected long startParkowania;
    protected long koniecParkowania;

    public abstract int obliczPłatnośćzaParkowanie();

    public void starttimer() {
        startParkowania = System.currentTimeMillis();
    }

    public void stoptheTimer() {
        koniecParkowania = System.currentTimeMillis();
    }
}
// Kolejny typ pojazdu ciężarówka etc. z innym algorytmem liczenia płatności
