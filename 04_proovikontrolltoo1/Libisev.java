import java.util.Arrays;

public class Libisev {
    /* Koosta funktsioon massiivi libiseva keskmise leidmiseks. Väljundiks on massiiv, 
    mis on sisendist kahe elemendi võrra lühem ning mille iga elemendi väärtuseks on 
    sisendmassiivi vastava elemendi ning selle järgmise ja ülejärgmise elemendi keskmine. */
    public static void libisevKeskmine(int [] array) {
        int arvudMassiivis = array.length;
        double[] libisevadKeskmised = new double[arvudMassiivis - 2];
        for(int i = 0; i < (array.length - 2); i++) {
            double keskmine = Keskmine.kolmeKeskmine(array[i], array[i + 1], array[i + 2]);
            libisevadKeskmised[i] = keskmine;
        }
        System.out.println(Arrays.toString(libisevadKeskmised));

    }
}
