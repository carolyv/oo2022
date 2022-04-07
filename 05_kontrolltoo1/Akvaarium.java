public class Akvaarium {
    
    double pikkus, laius, korgus;
    double vesi = 0.0;
    public Akvaarium(double pikkus, double laius, double korgus) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.korgus = korgus;
    }
    // 1)
    public double ruumala() {
        return pikkus * laius * korgus;
    }
    // 2)
    public double veeKogus() {
        return vesi;
    }

    public double lisaVett(double veeLisa) {
        vesi += veeLisa;
        if(ruumala() < vesi) {
            System.out.println("Nii palju vett ei mahu!");
            vesi -= veeLisa;
        }
        return vesi;
    }
    // 3)
    public void valaVett(Akvaarium a, double veeKogus) {
        double suurenevAkvV = a.ruumala();
        vesi -= veeKogus;
        a.lisaVett(veeKogus);
        if(vesi < 0) {
            System.out.println("Nii palju vett ei saa ara votta..");
            vesi += veeKogus;
            a.lisaVett(-veeKogus);
        } 
        // kontroll
        double korgusRuum = (suurenevAkvV - veeKogus) / (a.pikkus * a.laius);
        if((korgusRuum) < 2) {
            System.out.println("Akvaariumi servani on vahem kui 2 cm!");
        }
    }
}

