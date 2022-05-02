import java.util.ArrayList;

public class Joogivaat {
    double ruumala, joogiKogus; // kuupdetsimeeter, liitrid
    Joogikast kast = null;
    public Joogivaat(double ruumala, double joogiKogus, Joogikast kast) {
        this.ruumala = ruumala;
        this.joogiKogus = joogiKogus;
        this.kast = kast;
    }
    public void taidaPudel(Joogipudel j) {
        joogiKogus-=j.maht;
        if(joogiKogus < 0) {
            joogiKogus+=j.maht;
            System.out.println("Joogivaadis pole piisavalt jooki!");
        } else {
            System.out.println("Joogivaadis on jäänud jooki: " + joogiKogus + " liitrit.");
        }  
    }

    public void joogiVillimine(ArrayList<Joogipudel> pudelid) {
        for(int i = 0; i < pudelid.size(); i++) {
            taidaPudel((Joogipudel) pudelid.get(i));
        }
    }
}
