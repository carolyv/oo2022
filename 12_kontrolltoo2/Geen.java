import java.util.Random;

public class Geen {
    Alleel a1, a2;
    public Geen(Alleel a1, Alleel a2) throws Exception {
        if(a1.nimetus != a2.nimetus) {
            throw new Exception("Alleelid pole sama nimetusega!");
        } else {
            this.a1 = a1;
            this.a2 = a2;
        }
    }

    public String geeniVaartus() {
        if(a1.kasPos == true || a2.kasPos == true) {
            return "Positiivne";
        } else {
            return "Negatiivne";
        }
    }

    public Alleel juhuslikAlleel() {
        Random r = new Random();
        boolean random = r.nextBoolean();
        if(random) {
            System.out.println("Alleel: a1");
            return a1;
        } else {
            System.out.println("Alleel: a2");
            return a2;
        }
    }

    public Geen geeniUhendamine(Geen g) throws Exception {
        Alleel a1 = juhuslikAlleel();
        Alleel a2 = g.juhuslikAlleel();
        Geen uusGeen = new Geen(a1, a2);
        System.out.println("Tekkinud geen:");
        System.out.println("Nimetus: " + uusGeen.a1.nimetus);
        System.out.println("Väärtus: " + uusGeen.geeniVaartus());
        return uusGeen;
    }
}
