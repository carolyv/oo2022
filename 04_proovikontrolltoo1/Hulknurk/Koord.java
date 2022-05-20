package Hulknurk;
import java.util.ArrayList;

public class Koord {
    ArrayList<Integer> xKoord;
    ArrayList<Integer> yKoord;
    public Koord(ArrayList<Integer>xKoord, ArrayList<Integer>yKoord) {
        this.xKoord = xKoord;
        this.yKoord = yKoord;
    }
    // 1)
    public void prindiKoord() {
        System.out.println("Kolmnurga tipu koordinaadid: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("(" + xKoord.get(i) + "; " + yKoord.get(i) + ")");
        }
    }
    // 2) kasklus koordinaadipaari lisamiseks
    public void lisaPaar(int x, int y) {
        xKoord.add(x);
        yKoord.add(y);
        System.out.println("Uued koordinaadid lisatud!");
        prindiKoord();
    }
    // 2) tekkinud hulgnurga umbermoodu arvutamine
    public void arvutaUmbermoot() {
        double pikkus;
        double umbermoot = 0;
        int arrPikkus = xKoord.size();
        for(int i = 0; i < arrPikkus; i++) { 
            if(i == arrPikkus - 1) {
                int x = Math.abs(xKoord.get(0) - xKoord.get(i));
                int y = Math.abs(yKoord.get(0) - yKoord.get(i));
                pikkus = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            }  else {
                int x = Math.abs(xKoord.get(i + 1) - xKoord.get(i));
                int y = Math.abs(yKoord.get(i + 1) - yKoord.get(i));
                pikkus = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            }       
            umbermoot += pikkus;
        }
        System.out.println(String.format("Hulknurga umbermoot on: %.2f", umbermoot));
        /* valem
        x=|x2 - x1| y=|y2 - y1|
        loigu pikkus = sqrt(x^2 + y^2)
        */
    }
}
