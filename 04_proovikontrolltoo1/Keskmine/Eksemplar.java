package Keskmine;

import java.util.ArrayList;

public class Eksemplar {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Double> libisevad = new ArrayList<Double>();
    int arvutused = 0;
    public Eksemplar(ArrayList<Integer> arr) {
        this.arr = arr;
    }
    public void lisaArv(int x) {
        arr.add(x);
    }
    public double aritKesk(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public ArrayList<Double> libisevKesk() {
        int n = arr.size() - 2;
        for(int i = arvutused; arvutused < n; i++) {
            double kesk = aritKesk(arr.get(i), arr.get(i + 1), arr.get(i +2));
            libisevad.add(kesk);
            arvutused++;
        }
        return libisevad;
    }
}
