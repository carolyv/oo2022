package Loeng.Kujundid;

public abstract class Kujund {
    double korgus;
    public abstract double pohjaYmbermoot();
    public double kyljePindala(){
        return pohjaYmbermoot() * korgus;
    }
}
