public class ArvutaKolmega {
    public static void main(String[] arg) {
        int arv1 = Integer.parseInt(arg[0]);
        if(arg.length > 1) {
            int arv2 = Integer.parseInt(arg[1]);
            System.out.println("Esimene arvutus: " + arv1 * 3);
            System.out.println("Teine arvutus: " + arv2 * 3);
        } else {
            System.out.println("Kolmega korrutamine: " + arv1 * 3);
        }
        for(int i=0; i < arv1; i++) {
            System.out.println("Tere");
        }
    }
}
