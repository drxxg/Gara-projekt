package Gara;

public class Miejsca {
    private int Park;

    public Miejsca(int initialPark) {
        this.Park = initialPark;
    }
    public int leaveParking() {
        return Park;
    }
    public void Park(int amount) {
        Park -= amount;
    }
}



