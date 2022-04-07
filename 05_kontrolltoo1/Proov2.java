public class Proov2 {
    public static void main(String[] args) {
        Akvaarium akv = new Akvaarium(80, 70, 30);
        Akvaarium akv2 = new Akvaarium(60, 35, 40);

        // akvaariumite ruumalad
        //System.out.println(akv.ruumala()); // akv 75000
        //System.out.println(akv2.ruumala()); // akv2 84000

        akv.lisaVett(85000);
        akv2.lisaVett(0);

        akv.valaVett(akv2, 83999);

        System.out.println(akv.veeKogus());
        System.out.println(akv2.veeKogus());
    }
}
