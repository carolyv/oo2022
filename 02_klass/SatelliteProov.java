public class SatelliteProov {
    public static void main(String[] arg) {
        Satellite GSAT19 = new Satellite(35786);
        System.out.println(GSAT19.OrbitType());
        System.out.println(GSAT19.OrbitalSpeed());
        System.out.println("-------------------");
        Satellite ESTCube1 = new Satellite(665);
        System.out.println(ESTCube1.OrbitType());
        System.out.println(ESTCube1.OrbitalSpeed());
    }
}

/*
OUTPUT

Geostatsionaarne orbiit / high Earth & geosynchronous orbit
3337.329018948943 m/s
-------------------
Maa-lähedane orbiit / low Earth orbit
7526.493452815953 m/s

*/