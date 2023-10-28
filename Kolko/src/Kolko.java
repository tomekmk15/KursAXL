import java.util.Scanner;

     class Kolko {
    public static void main(String[] args) {
        char[][] plansza = new char[3][3]; // plansza 3x3
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                plansza[i][j] = ' '; // wypełnienie planszy pustymi znakami
            }
        }
        Gracz gracz1 = new Gracz("Gracz 1", 'X');
        Gracz gracz2 = new Gracz("Gracz 2", 'O');
        Gra gra = new Gra(plansza, gracz1);

        Scanner scanner = new Scanner(System.in);
        while (!gra.czyGraSkonczona()) {
            System.out.println(gra);
            Gracz aktualnyGracz = gra.getAktualnyGracz();
            System.out.println(aktualnyGracz.getNazwa() +
                    ", podaj wiersz (0-2): ");
            int wiersz = scanner.nextInt();
            System.out.print(aktualnyGracz.getNazwa() + ", podaj kolumnę (0-2): ");
            int kolumna = scanner.nextInt();
            if (gra.czyRuchMozliwy(wiersz, kolumna)) {
                gra.wykonajRuch(wiersz, kolumna);
            } else {
                System.out.println("Nieprawidłowy ruch, spróbuj ponownie.");
            }
        }
        scanner.close();
        System.out.println(gra);
        if (gra.czyRemis()) {
            System.out.println("Gra zakończona remisem.");
        } else {
            Gracz zwyciezca = gra.getAktualnyGracz();
            System.out.println("Gracz " + zwyciezca.getNazwa() + " wygrał grę!");
        }
    }
}