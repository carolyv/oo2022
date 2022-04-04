package Loeng.Ulesanne;

public class Punktid2Da {

    public static void main(String[] args) {
        double kaugeim = 0;
        int index = 0;
        Punkt2D p[] = new Punkt2D[3];
        p[0] = new Punkt2D(2.1, 3.0);
        p[1] = new Punkt2D(8.5, 10.2);
        p[2] = new Punkt2D(9.2, 1.1);
        for(int i = 0; i < 3; i++) {
            double kaugus = p[i].kaugusNullist();
            if(kaugus > kaugeim) {
                kaugeim = kaugus;
                index = i;
            }
        }
        System.out.println("Kaugeim punkt: " + p[index].kirjutaAndmed());
    }
    
}
