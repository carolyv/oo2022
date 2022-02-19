public class Proov1 {
    public static void main(String[] arg) {
        Isikukood malle = new Isikukood("49403136515");
        Isikukood kalle = new Isikukood("34501234215");
        System.out.println(malle.sugu());
        System.out.println(malle.synniaasta());
        System.out.println(kalle.sugu());
        System.out.println(kalle.synniaasta());
    }
}
