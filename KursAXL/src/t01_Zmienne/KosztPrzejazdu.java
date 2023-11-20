package t01_Zmienne;

import java.util.Scanner;

public class KosztPrzejazdu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Miasto A: ");
        String miastoA = scanner.nextLine();

        System.out.print("Miasto B: ");
        String miastoB = scanner.nextLine();

        System.out.print("Dystans " + miastoA + "-" + miastoB + ": ");
        double dystans = scanner.nextDouble();

        System.out.print("Cena paliwa: ");
        double cena = scanner.nextDouble();

        System.out.print("Spalanie na 100 km: ");
        double spalanie = scanner.nextDouble();

        double koszt = dystans * cena * spalanie / 100;

        System.out.println("Koszt przejazdu " + miastoA + "-" + miastoB + " to " + koszt + " PLN");

        // Formatowanie do liczby całkowitej
        int kosztCalosciowy = (int) koszt;
        System.out.println("Koszt przejazdu " + miastoA + "-" + miastoB + " to " + kosztCalosciowy + " PLN");

        // Formatowanie do dwóch miejsc po przecinku
        System.out.printf("Koszt przejazdu %s-%s to %.2f PLN\n", miastoA, miastoB, koszt);
    }
}
