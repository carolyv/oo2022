public class Iridium33 implements Satellite {
    public void satelliteName() {
        System.out.println("Iridium 33");
    }
    public void satelliteMission() {
        System.out.println("Kommunikatsiooni satelliit");
    }
    public boolean isActive() {
        return false;
    }
    public String orbitalSpeed(int radius) {
        if(isActive() == false ) {
            return "0 m/s";
        } else {
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
    }
}
