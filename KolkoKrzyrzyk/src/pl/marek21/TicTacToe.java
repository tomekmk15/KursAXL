package pl.marek21;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze kółko i krzyżyk!");
        System.out.print("Podaj imię pierwszego gracza: ");
        String nazwaGracza1 = scanner.nextLine();
        Gracz gracz1 = new Gracz(nazwaGracza1, 'X');

        System.out.print("Podaj imię drugiego gracza: ");
        String nazwaGracza2 = scanner.nextLine();
        Gracz gracz2 = new Gracz(nazwaGracza2, 'O');

        Gra gra = new Gra(gracz1, gracz2);

        System.out.println("\nRozpoczyna gracz " + gra.getAktualnyGracz().getNazwa() + " (" + gra.getAktualnyGracz().getOznaczenie() + ")");
        System.out.println(gra.getPlansza());

        while (!gra.czyGraSkonczona()) {
            System.out.print("Gracz " + gra.getAktualnyGracz().getNazwa() + ", podaj numer wiersza (1-3): ");
            int wiersz = scanner.nextInt();

            System.out.print("Gracz " + gra.getAktualnyGracz().getNazwa() + ", podaj numer kolumny (1-3): ");
            int kolumna = scanner.nextInt();

            if (gra.czyRuchMozliwy(wiersz, kolumna)) {
                gra.wykonajRuch(wiersz, kolumna);
                System.out.println(gra.getPlansza());

                if (gra.czyWygrana()) {
                    System.out.println("Gratulacje, wygrywa gracz " + gra.getAktualnyGracz().getNazwa() + " (" + gra.getAktualnyGracz().getOznaczenie() + ")!");
                    return;
                }

                if (gra.czyRemis()) {
                    System.out.println("Remis!");
                    return;
                }

                gra.zmienGracza();
                System.out.println("\nRuch wykonany przez gracza " + gra.getAktualnyGracz().getNazwa() + " (" + gra.getAktualnyGracz().getOznaczenie() + ")");
                System.out.println(gra.getPlansza());
            } else {
                System.out.println("Niepoprawny ruch! Spróbuj ponownie.");
            }
        }
    }

}
