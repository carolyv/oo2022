public class Proov2a {
    public static void main(String[] args) {
        String juhis = "kee";
        if(args.length > 0) {juhis = args[0];}
        Kilpkonn k1 = new Kilpkonn();
        for(int i = 0; i < juhis.length(); i++) {
            if (juhis.charAt(i) == 'k') { 
                k1.keera(); 
            } else {
                k1.edasi();
            }
            System.out.println(k1);
        }
        System.out.println(k1.kysiX());
    }
}
