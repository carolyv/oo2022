public class Main {
    public static void main(String[] args) throws Exception {
        // 1)
        Alleel a1 = new Alleel("Reesus", true);
        Alleel a2 = new Alleel("Reesus", false);
        Alleel a3 = new Alleel("Reesus", false);
        Geen g1 = new Geen(a1, a2); 
        Geen g2 = new Geen(a2, a3);
        System.out.println("Esimese geeni väärtus: " + g1.geeniVaartus()); // pos
        System.out.println("Teise geeni väärtus: " + g2.geeniVaartus()); // neg
    }
    
}
