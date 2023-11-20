package Petle.zadania;

import java.util.Random;
import java.util.Scanner;

public class Zgadyw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        System.out.println("ILe to jest" + x + " razy" + y + "?");
        int odp  =scanner.nextInt();
        int liczba_prob = 1;
        while(odp != x*y) {
            System.out.println("Niepoprawna odpowiedź, podaj kolejną:");
            odp = scanner.nextInt();
            liczba_prob++;
        }
        System.out.println("Gratuluję, poprawna odpowiedź!");
        System.out.println("Udało się w " + liczba_prob + " próbie.");
    }

}





