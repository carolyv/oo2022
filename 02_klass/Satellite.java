public class Satellite {

    double radius;
    public Satellite(double radius) {
        this.radius = radius;
    }

    public String OrbitalSpeed() {
        double gravitationalConstant = 6.67408 * Math.pow(10, -11);
        double earthMass = 5.972 * Math.pow(10, 24);
        if(radius < 6371) {
            radius = radius + 6371; // Maa raadius
        }
        double radiusInMeters = radius * 1000;
        double orbitSpeed = Math.sqrt((gravitationalConstant * earthMass) / radiusInMeters);
        String speed = String.valueOf(orbitSpeed);
        return speed + " m/s";
    }

    public String OrbitType() {
        if(radius < 2000) {
            return "Maa-lähedane orbiit / low Earth orbit";
        } else if(radius > 2000 && radius < 35780) {
            return "Keskmise korgusega orbiit / mid Earth orbit";
        } else {
            return "Geostatsionaarne orbiit / high Earth & geosynchronous orbit";
        } 
        
    }

}
