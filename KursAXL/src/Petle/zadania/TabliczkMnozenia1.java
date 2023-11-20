package Petle.zadania;

public class TabliczkMnozenia1 {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a; k++) {
                System.out.print((i * k) + "\t");
            }
            System.out.println();
        }
    }
}


