public class Proov {
    public static void main(String[] args) {
        Iridium33 iridium = new Iridium33();
        iridium.satelliteName();
        iridium.satelliteMission();
        System.out.println(iridium.isActive());
        System.out.println(iridium.orbitalSpeed(790));
        System.out.println("--------------------------");
        Hitomi hitomi = new Hitomi();
        hitomi.satelliteName();
        hitomi.satelliteMission();
        System.out.println(hitomi.isActive());
        System.out.println(hitomi.orbitalSpeed(575));
    }
    
}
/* output
Iridium 33
Kommunikatsiooni satelliit
false
0 m/s
--------------------------
Hitomi / ASTRO-H
Röntgenastronoomia
false
0 m/s
*/