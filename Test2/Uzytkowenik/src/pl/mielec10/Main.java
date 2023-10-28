package pl.mielec10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie uzytkownika");

        String imie = scanner.nextLine();

        System.out.println("Podaj wiek uzytkownika");
        int wiek = scanner.nextInt();

        Uzytkownik uzytkownik = new Uzytkownik(wiek, imie);

        if (uzytkownik.czyPelnoletni()) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}



