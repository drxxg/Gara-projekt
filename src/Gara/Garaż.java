package Gara;

import javax.swing.*;

public class Garaż {

    static int LiczbaAut;
    static JList Rejestracja;

    String name;

    Garaż(String name){
        this.name = name;
        LiczbaAut++;
    }
}
