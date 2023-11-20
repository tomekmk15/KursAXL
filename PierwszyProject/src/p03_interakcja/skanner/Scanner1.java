package p03_interakcja.skanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        // Scanner to jest obiekt, który pobiera dane ze wskazanego źródła i na żądanie zwraca kolejne elementy
        // kórymi mogą być: całe linie, pojedyncze słowa, liczby, ...

        // Deklarujemy zmienną scanner typu Scanner i wpisujemy do niej nowy obiekt klasy Scanner.
        // Ten obiekt skanera będzie czytał dane ze standardowego wejścia.
        Scanner scanner = new Scanner(System.in);

        // Typowa interakcja z użytkownikiem: za pomocą print zadajemy pytania,
        // a poprzez skaner wczytujemy odpowiedź.

        System.out.println("Wpisz linię tekstu:");
        String linia = scanner.nextLine();
        System.out.println("Napisałeś: " + linia);

        // Scanner potrafi bezpośrednio (bez żadnego parseInt itp) wczytywać liczby
        System.out.print("Podaj dwie liczby: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("%d × %d = %d\n", x, y, x*y);

        // Teoretycznie Scanner jest zasobem i należałoby go zamknąć,
        // ale w praktyce, jeśli chodzi o System.in, to niezamknięcie nie jest błędem; nic złego by się nie stało.
        scanner.close();
    }

}
