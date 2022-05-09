public class Main2 {
    public static void main(String[] args) throws Exception {
        // 2)
        //alleelid
        Alleel alleel1 = new Alleel("Reesus", true);
        Alleel alleel2 = new Alleel("Reesus", false);
        Alleel alleel3 = new Alleel("Reesus", false);
        Alleel alleel4 = new Alleel("Reesus", true);
        Geen g1 = new Geen(alleel1, alleel2);
        Geen g2 = new Geen(alleel3, alleel4);
        g1.geeniUhendamine(g2);
    }
}
