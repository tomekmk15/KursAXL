package Petle.zadania;

import java.util.Scanner;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość tabliczki mnożenia:");
        int wysokosc = scanner.nextInt();

        System.out.println("Podaj szerokość tabliczki mnożenia:");
        int szerokosc = scanner.nextInt();

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= szerokosc; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
