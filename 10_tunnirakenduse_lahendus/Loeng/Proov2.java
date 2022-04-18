import java.util.*;

public class Proov2 {
    public static void main(String[] args) {
        Map<Integer, String> valvajad = new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);
        
        Map<String, Integer> hinded = new HashMap<>();
        hinded.put("Salme", 5);
        hinded.put("Kalle", 4);
        hinded.put("Malle", 3);
        hinded.put("Valle", 4);
        System.out.println(hinded);
        System.out.println(hinded.keySet());
    }
}
