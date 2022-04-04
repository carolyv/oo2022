package Loeng.Ulesanne;

public class Punkt2D {
    double x, y;
    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String kirjutaAndmed(){
        return "x="+x+" y="+y;
      }
    public double kaugusNullist(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
}
