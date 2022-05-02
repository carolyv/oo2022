import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        Jook vesi = new Jook("vesi", 0.9, 1);
        Joogipudel pudel1 = new Joogipudel(1, 0.3, 0.1, "Plastmass", vesi);
        // Tühjad pudelid
        Joogipudel pudel2 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel3 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel4 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel5 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        pudelid.add(pudel2);
        pudelid.add(pudel3);
        pudelid.add(pudel4);
        pudelid.add(pudel5);
        
        System.out.println(pudel1.leiaMass());
        System.out.println(pudel1.leiaOmahind());
        System.out.println(pudel2.leiaMass());
        System.out.println(pudel2.leiaOmahind());
        
        Joogikast kast1 = new Joogikast("Puidust", 5, 3, 4);
        Joogivaat vaat1 = new Joogivaat(10.0, 7.0, kast1);
        //vaat1.taidaPudel(pudel2);
        vaat1.joogiVillimine(pudelid);
        System.out.println(kast1.leiaKastiMass(pudelid));
        System.out.println(kast1.leiaKastiOmahind(pudelid));
    }
}
