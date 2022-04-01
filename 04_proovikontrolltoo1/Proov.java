public class Proov {
    public static void main(String[] args) {
        // 1)
        System.out.println("Kolme arvu (3, 6, 2) keskmise leidmine: ");
        System.out.println(Keskmine.kolmeKeskmine(3, 6, 2));
        System.out.println("Kolme arvu (9, 5, 14) keskmise leidmine: ");
        System.out.println(Keskmine.kolmeKeskmine(9, 5, 14));
        System.out.println("-----------------------------");
        // 2)
        System.out.println("Libisev keskmine arvudega (22, 12, 6, 9, 11, 14): ");
        int[] test = {22, 12, 6, 9, 11, 14};
        Libisev.libisevKeskmine(test);
        System.out.println("-----------------------------");
        // 3)
    }
}
