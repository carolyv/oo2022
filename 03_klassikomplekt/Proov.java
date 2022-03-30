public class Proov {
    public static void main(String[] args) {

        Satellite GSAT19 = new Satellite("GSAT19", 35786);
        Satellite ESTC1 = new Satellite("ESTCube-1", 665);
        Satellite SLINK2426 = new Satellite("STARLINK-2426", 340);
        Satellite SLINK3122 = new Satellite("STARLINK-3122", 340);

        Maa maa = new Maa();

        maa.addSatellite(GSAT19);
        maa.addSatellite(ESTC1);
        maa.addSatellite(SLINK2426);
        maa.addSatellite(SLINK3122);

        System.out.println("Koik listis olevad satelliidid: ");
        maa.listSatellites();
        System.out.println("----------------------------");
        System.out.println("Satelliit " + ESTC1.name + " liigub orbiidil: " + ESTC1.OrbitType() + ", kiirusega " + ESTC1.OrbitalSpeed());
        System.out.println("Satelliit " + GSAT19.name + " liigub orbiidil: " + GSAT19.OrbitType() + ", kiirusega " + GSAT19.OrbitalSpeed());
    }
}
/* output 
Koik listis olevad satelliidid: 
GSAT19
ESTCube-1
STARLINK-2426
STARLINK-3122
----------------------------
Satelliit ESTCube-1 liigub orbiidil: maa-lähedane, kiirusega 7526.493452815953 m/s
Satelliit GSAT19 liigub orbiidil: geostatsionaarne, kiirusega 3337.329018948943 m/s
*/