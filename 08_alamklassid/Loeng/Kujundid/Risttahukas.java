package Loeng.Kujundid;

public class Risttahukas extends Kujund {
    double a, b;
    public Risttahukas(double a, double b, double korgus) {
        this.a = a;
        this.b = b;
        this.korgus = korgus;
    }
    @Override
    public double pohjaYmbermoot() {
        return 2 * (a + b);
    }
}
