// Programm, mis arvutab valja orbitaalse kiiruse Maa suhtes

public class OrbitalSpeed {
    
    public static double getOrbitalSpeed(double radius) {
        double gravitationalConstant = 6.67408 * Math.pow(10, -11);
        double earthMass = 5.972 * Math.pow(10, 24);
        if(radius < 6371) {
            radius = radius + 6371; // Maa raadius
        }
        double radiusInMeters = radius * 1000;
        double orbitSpeed = Math.sqrt((gravitationalConstant * earthMass) / radiusInMeters);
        return orbitSpeed;
    }

    public static void main(String[] args) {
        System.out.println("Kuu tiirleb kiirusel " + String.format("%.3f", getOrbitalSpeed(384400)) + " m/s");
        System.out.println("Rahvusvaheline kosmosejaam tiirleb kiirusel " + String.format("%.3f", getOrbitalSpeed(408)) + " m/s");
    }
}
/* OUTPUT
Kuu tiirleb kiirusel 1018.272 m/s
Rahvusvaheline kosmosejaam tiirleb kiirusel 7667.835 m/s
*/
