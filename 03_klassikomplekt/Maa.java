import java.util.*;

public class Maa {
    List<Satellite> satellites = new ArrayList<Satellite>();

    public void addSatellite(Satellite s) {
        satellites.add(s);
    }

    public void listSatellites() {
        for(int i = 0; i < satellites.size(); i++) {
            System.out.println(satellites.get(i).getSatelliteName());
        }
    }
}
