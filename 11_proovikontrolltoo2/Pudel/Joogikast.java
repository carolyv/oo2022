import java.util.ArrayList;

public class Joogikast {
    String kastityyp;
    double kastihind, kastimass;
    int pesadeArv;
    ArrayList<Joogipudel> kastiPudelid = new ArrayList<Joogipudel>();
    int hoivatudPesa = 0;
    public Joogikast(String kastityyp, double kastihind, double kastimass, int pesadeArv) {
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesadeArv = pesadeArv;
    }
    public double leiaKastiMass(ArrayList<Joogipudel> pudelid) {
        double pudeliteMass = 0;
        for(int i = 0; i < kastiPudelid.size(); i++) {
            pudeliteMass += ((Joogipudel) kastiPudelid.get(i)).leiaMass();
        }
        return pudeliteMass + kastimass;
    }

    public double leiaKastiOmahind(ArrayList<Joogipudel> pudelid) {
        double pudeliteHind = 0;
        for(int i = 0; i < kastiPudelid.size(); i++) {
            pudeliteHind += ((Joogipudel) kastiPudelid.get(i)).leiaOmahind();
        }
        return kastihind + pudeliteHind;
    }

    public void lisaPudelKasti(Joogipudel j) {
        kastiPudelid.add(j);
    }

    public boolean kasKastTyhi() {
        boolean kasTyhi = true;
        for(int i = 0; i < kastiPudelid.size(); i++) {
            if(kastiPudelid.get(i) != null) {
                kasTyhi = false;
            }
        }
        return kasTyhi;
    }

    public void kastiPudeliteVillimine(Joogivaat jv) {
        if(kasKastTyhi() == false) {
            jv.joogiVillimine(kastiPudelid);
        }
    }
}
