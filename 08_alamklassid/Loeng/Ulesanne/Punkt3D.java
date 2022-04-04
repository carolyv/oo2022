package Loeng.Ulesanne;

public class Punkt3D extends Punkt2D {
    double z;
    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public double kaugusNullist(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
    }
    public String kirjutaAndmed(){
        return "x="+x+" y="+y+" z="+z;
      }
}
