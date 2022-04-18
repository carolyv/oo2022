package Loomine;

public class Proov1 {
    public static void main(String[] args) {
        SamaTyypiPaar<Integer> asukoht = new SamaTyypiPaar<>();
        asukoht.esimene = 7;
        asukoht.teine = 4;
        System.out.println(asukoht.toString());

        SamaTyypiPaar<String> taisnimi = new SamaTyypiPaar<>();
        taisnimi.esimene = "Juku";
        taisnimi.teine = "Tamm";
        System.out.println(taisnimi.toString());

        
    }
}
