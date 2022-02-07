public class Funktsioonid2 {
    public double summa = 0;

    public static double sentimeetriteks(double tollid) {
        return tollid * 2.54;
    }

    public static double tollideks(double sentimeetrid) {
        return sentimeetrid / 2.54;
    }

    public static double[] reaalarvudeks(String[] sd) {
        double[] v = new double[sd.length];
        for(int i = 0; i<sd.length; i++) {
            v[i] = Double.parseDouble(sd[i]);
        }
        return v;
    }

    public static void main(String[] args) {
        double[] arvud = reaalarvudeks(args);
        if(arvud.length == 0) {
            throw new RuntimeException("Arvud puuduvad");
        }
        double summa = 0;
        double summa2 = 0;
        for(int i=0; i < arvud.length; i++) {
            summa += arvud[i];
        }
        double aritmeetilineKesk = summa / arvud.length;
        for(int i=0; i < arvud.length; i++) {
            double arv2 = Math.pow((arvud[i] - aritmeetilineKesk), 2);
            summa2 += arv2;
        }
        double standardhalve = Math.sqrt(summa2 / arvud.length);
        System.out.println("Standardhalve on " + standardhalve);
    }
}

// Ruutjuur Math.sqrt(36)
// Funktsioonina oleks võinud nt teha aritmeetilise keskmise
/* OUTPUT
PS C:\Users\Student Admin\Desktop\T1> java Funktsioonid2 2 8 16.3
5.08
20.32
41.402
*/