package Loeng.Kujundid;

public class Silinder extends Kujund {
    double raadius;
    public Silinder(double raadius, double korgus) {
        this.raadius = raadius;
        this.korgus = korgus;
    }
    @Override
    public double pohjaYmbermoot() {
        return 2 * Math.PI * raadius;
    }
}
