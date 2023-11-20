package Petle.zadania;
import java.util.Random;
import java.util.Scanner;

public class MnozenieProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        int poprawnyWynik = x * y;
        int odpowiedzUzytkownika;

        System.out.println("Witaj! Zadanie: " + x + " * " + y);
        System.out.println("Podaj wynik mnożenia: ");

        while (true) {
            odpowiedzUzytkownika = scanner.nextInt();

            if (odpowiedzUzytkownika == poprawnyWynik) {
                System.out.println("Poprawna odpowiedź! Gratulacje!");
                break;
            } else {
                System.out.println("Nieprawidłowa odpowiedź. Spróbuj ponownie: ");
            }
        }

    }
}

