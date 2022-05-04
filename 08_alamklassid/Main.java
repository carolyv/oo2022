public class Main {
    public static void main(String[] args) {
        Permutatsioon p = new Permutatsioon();
        System.out.println("Permutatsioon arvust 5: " + p.leiaPerm(5));
        Variatsioon v = new Variatsioon();
        System.out.println("30 opilasega klassist saab valja valida 2 opilast " + v.leiaVariatsioon(30, 2) + " erineval viisil.");
        Variatsioon v2 = new Variatsioon();
        System.out.println(v2.leiaVariatsioon(6, 4));
        
    }
}

/* OUTPUT:

Permutatsioon arvust 5: 120
30 opilasega klassist saab valja valida 2 opilast 870 erineval viisil.
360

Permutatsiooni valem: Pn = n!
Variatsiooni valem: n! / (n - k)!

*/
