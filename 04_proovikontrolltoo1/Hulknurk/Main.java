package Hulknurk;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // EKSEMPLAR 1
        ArrayList<Integer> xK1 = new ArrayList<Integer>();
        ArrayList<Integer> yK1 = new ArrayList<Integer>();
        xK1.add(1);
        xK1.add(5);
        xK1.add(3);
        yK1.add(8);
        yK1.add(3);
        yK1.add(5);
        Koord eksemplar1 = new Koord(xK1, yK1);
        eksemplar1.prindiKoord();
        // EKSEMPLAR 2
        ArrayList<Integer> xK2 = new ArrayList<Integer>();
        ArrayList<Integer> yK2 = new ArrayList<Integer>();
        xK2.add(7);
        xK2.add(1);
        xK2.add(2);
        yK2.add(2);
        yK2.add(7);
        yK2.add(3);
        Koord eksemplar2 = new Koord(xK2, yK2);
        eksemplar2.prindiKoord();

        eksemplar1.arvutaUmbermoot();
    }
}
