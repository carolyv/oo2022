package Loomine;

public class Proov3 {
    public static void main(String[] args) {
        PaarideLoendur1<Character> p1 = new PaarideLoendur1<>();
        String lause = "kaval ants ja vanapagana saapad vanapagana laekas ananassi kõrval 1212";
        for(int i = 0; i < lause.length(); i++) {
            p1.lisa(lause.charAt(i));
        }
        System.out.println(p1.loendur);
        System.out.println("----------------");
        System.out.println(p1.jarjestatud());
    }
}
