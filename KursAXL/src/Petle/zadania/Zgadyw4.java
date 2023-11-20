package Petle.zadania;

import java.util.Random;
import java.util.Scanner;

public class Zgadyw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        int liczba_prob = 0;
        while(true) {
            liczba_prob++;
            System.out.println("Ile to jest " + x + " razy " + y + "?");
            int odp = scanner.nextInt();
            if(odp == x * y) {
                System.out.println("Gratuluję, poprawna odpowiedź!");
                System.out.println("Udało się w " + liczba_prob + " próbie.");
                break;
            }
            System.out.println("Błędna odpowiedź");
        }

        System.out.println("Koniec programu");
    }

}



