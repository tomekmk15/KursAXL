package Funkcje.zadania;

public class PierwszeFunkcjeZWynikiem1 {


    static double poleProstokata(double a, double b) {
        return a * b;


    }
    static double obwodProstokata(double a, double b) {
        return 2 * a + 2 * b;
    }

    static int max(int a, int b) {
        return Math.max(a, b);


    }

    static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);

    }





    public static void main(String[] args) {
        System.out.println(poleProstokata(3,  4));
        System.out.println(poleProstokata(5,  7.5));
        System.out.println();

        System.out.println(max(5, 10));
        System.out.println(max(8, 3, 11));

    }


}
