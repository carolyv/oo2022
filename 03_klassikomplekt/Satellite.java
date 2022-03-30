public class Satellite {
    String name;
    double radius;

    public Satellite(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getSatelliteName() {
        return name;
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
            return "maa-lähedane";
        } else if(radius > 2000 && radius < 35780) {
            return "keskmise korgusega";
        } else {
            return "geostatsionaarne";
        } 
        
    }
}