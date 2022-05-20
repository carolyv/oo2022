package Keskmine;

import java.util.ArrayList;

public class Main {
    // 1)
    public static double aritKesk(double x, double y, double z) {
        return (x + y + z) / 3;
    }
    // 2)
    public static ArrayList<Double> libisevKesk(ArrayList<Integer> arr) {
        ArrayList<Double> libisevad = new ArrayList<Double>();
        int n = arr.size() - 2;
        for(int i = 0; i < n; i++) {
            double kesk = aritKesk(arr.get(i), arr.get(i + 1), arr.get(i +2));
            libisevad.add(kesk);
        }
        return libisevad;
    }
    public static void main(String[] args) {
        // 1) 3 arvu aritmeetiline keskmine, katsetused
        System.out.println(String.format("Aritmeetiline keskmine: %.2f", aritKesk(2, 5, 7)));
        System.out.println(String.format("Aritmeetiline keskmine: %.2f", aritKesk(13, 20, 15)));
        // 2) libiseva keskmise leidmine
        ArrayList<Integer> massiiv = new ArrayList<Integer>();
        massiiv.add(2);
        massiiv.add(7);
        massiiv.add(1);
        massiiv.add(9);
        massiiv.add(3);
        System.out.println(libisevKesk(massiiv));
        // 3) eksemplar
        Eksemplar test = new Eksemplar(massiiv);
        System.out.println("-------------------");
        System.out.println(test.libisevKesk());
        test.lisaArv(8);
        System.out.println(test.libisevKesk());
        test.lisaArv(2);
        System.out.println(test.libisevKesk());
    }
}
/*
OUTPUT:
Aritmeetiline keskmine: 4.67
Aritmeetiline keskmine: 16.00
[3.3333333333333335, 5.666666666666667, 4.333333333333333]
-------------------
[3.3333333333333335, 5.666666666666667, 4.333333333333333]
[3.3333333333333335, 5.666666666666667, 4.333333333333333, 6.666666666666667]
[3.3333333333333335, 5.666666666666667, 4.333333333333333, 6.666666666666667, 4.333333333333333]
*/
