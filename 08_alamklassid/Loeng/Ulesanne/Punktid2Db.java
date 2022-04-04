package Loeng.Ulesanne;

public class Punktid2Db {
    public static void main(String[] args){
        double kaugeim = 0;
        int index = 0;
        Punkt2D p[] = new Punkt2D[5];
        p[0] = new Punkt2D(3.2, 4.1);
        p[1] = new Punkt3D(7.2, 0.1, 5.1);
        p[2] = new Punkt3D(4.1, 3.2, 2.2);
        p[3] = new Punkt2D(6.4, 1.5);
        p[4] = new Punkt2D(2.0, 7.9);
        for(int i = 0; i < 5; i++) {
            double kaugus = p[i].kaugusNullist();
            if(kaugus > kaugeim) {
                kaugeim = kaugus;
                index = i;
            }
        }
        System.out.println("Kaugeim punkt: " + p[index].kirjutaAndmed());
    }
}
