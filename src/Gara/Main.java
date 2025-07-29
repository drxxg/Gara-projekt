package Gara;

public class Main {

    public static void main(String[] args) {

        double Miejsca = 16;

        Garaż auto1 = new Garaż("WE 153R3");
        Garaż auto2 = new Garaż("WB 3DJ4S");
        Garaż auto3 = new Garaż("WI DF93KD");
        Garaż auto4 = new Garaż("K 323H4");
        Garaż auto5 = new Garaż("DB 03D3G");

        System.out.println("W garażu znajduje sie " + Garaż.LiczbaAut + " samochodów");

        System.out.println("Rejestracja: " + auto1.getrejestracja());
    }




    }
