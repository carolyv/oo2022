public class Joogipudel {
    double maht, mass, taaraMaksumus;
    String pudelityyp;
    Jook jook = null;
    public Joogipudel(double maht, double mass, double taaraMaksumus, String pudelityyp, Jook jook) {
        this.maht = maht; // mahtuvus liitrites
        this.mass = mass; // kg
        this.taaraMaksumus = taaraMaksumus; // eurodes
        this.pudelityyp = pudelityyp;
        this.jook = jook;
    }
    public double leiaMass() {
        if(jook == null) {
            return mass;
        } else {
            return (maht * jook.erikaal) + mass;
        }   
    }

    public double leiaOmahind() {
        if(jook == null) {
            return taaraMaksumus;
        } else {
            return (jook.omahind * maht) + taaraMaksumus;
        }
    }
}
