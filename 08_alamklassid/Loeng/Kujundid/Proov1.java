package Loeng.Kujundid;
import java.util.*;

public class Proov1 {
    public static double kyljePindaladeSumma(ArrayList<Kujund> m) {
        double summa = 0.0;
        for(Kujund k: m) {
            summa+=k.kyljePindala();
        }
        return summa;
    }
    public static void main(String[] args) {
        ArrayList<Kujund> kd = new ArrayList<Kujund>();
        //Kujund[] kd = new Kujund[3];
        kd.add(new Risttahukas(2, 3, 4));
        kd.add(new Silinder(4, 2));
        kd.add(new Risttahukas(6, 1, 2));

        System.out.println(kd.get(1).pohjaYmbermoot());
        System.out.println(kd.get(1).kyljePindala());
        System.out.println(kyljePindaladeSumma(kd));
    }
    
}
