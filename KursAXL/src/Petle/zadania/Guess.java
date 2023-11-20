package Petle.zadania;

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(1000);
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę z zakresu od 0 do 999!");

        while (true) {
            System.out.print("Podaj swoją propozycję: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println(" Zgadłes liczbę " + numberToGuess + " w " + attempts + " probie.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Podana liczba jest za mała.");
            } else {
                System.out.println("Podana liczba jest za duza.");
            }
        }


    }
}
