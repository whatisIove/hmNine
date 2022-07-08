package ua.ithillel.java;

public class Main {
    public static void main(String[] args) {

        double a = Methods.add(12.5, 22.5);
        double b = Methods.add(11.5, 5);
        double c = Methods.add(18, 74.1, 62);
        double d = Methods.add(-127,127.7);

        double q = Methods.sub(66.6, 77.7);
        double w = Methods.mul(505, 88.5);
        int e = Methods.div(9452, 222);

        double add = a + b;
        double sub = c - d;

        double mul = w * e;
        double div = e / q;

        System.out.println(mul);
    }
}
