public class Proov {
    public static void main(String[] args){
        Akvaarium akv = new Akvaarium(50, 25, 30);
        // kasklus ruumala valjastamiseks
        System.out.println(akv.ruumala());
        // hoiab meeles hoitava vee kogust
        System.out.println(akv.veeKogus());
        akv.lisaVett(10000);
        System.out.println(akv.veeKogus());
        akv.lisaVett(40000);
        System.out.println(akv.veeKogus());
        akv.lisaVett(3000);
        System.out.println(akv.veeKogus());

    }
}
