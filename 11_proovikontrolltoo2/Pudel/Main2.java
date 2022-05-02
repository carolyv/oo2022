public class Main2 {
    public static void main(String[] args){
        // Joogikasti asjad
        Joogikast kast = new Joogikast("Puit", 5, 3, 6);
        Joogivaat vaat = new Joogivaat(30, 10, kast);
        Joogipudel pudel1 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel2 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel3 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel4 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        Joogipudel pudel5 = new Joogipudel(0.8, 0.4, 0.2, "Plastmass", null);
        kast.lisaPudelKasti(pudel1);
        kast.lisaPudelKasti(pudel2);
        kast.lisaPudelKasti(pudel3);
        kast.lisaPudelKasti(pudel4);
        kast.lisaPudelKasti(pudel5);
        System.out.println(kast.kastihind + " eurot");
        System.out.println(kast.kastimass + " kg");
        kast.kastiPudeliteVillimine(vaat);
    }
}
