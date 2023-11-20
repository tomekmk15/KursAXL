package zadania;

import java.util.Arrays;
import java.util.Random;

public class LosowaTablica {
    public static void main(String[] args) {
        // Utwórz tablicę 21 liczb

        // Wypełnij tablicę losowymi liczbami z zakresu 0-99

        // Wypisz całą tablicę (Arrays.toString())

        // Oblicz średnią arytmetyczną

        // Posortuj tablicę rosnąco i wypisz ponownie
        // (spróbuj znaleźć odp operację)

        // Wypisz liczby z tej tablicy, ale w takiej kolejności:
        // element nr 0, ostatni element, element nr 1, przedostatni element, ...
        // aż do wypisania środkowego elementu (tylko jeden raz).

            int[] table = new int[21];
            Random random = new Random();


            for (int i = 0; i < table.length; i++)
            {
                table[i] = random.nextInt(100);
            }
            System.out.println("Tablica :");
            System.out.println(Arrays.toString(table));


            double suma = 0;
        for (int liczba : table) {

                suma += liczba;
            }
            double suma1 = suma + table.length;
            System.out.println("suma  : " + suma1);


            Arrays.sort(table);


            System.out.println("\nSort");
            System.out.println(Arrays.toString(table));


            System.out.println("\nkolejnosc:");
            int kol = table.length;
            for (int i = 0; i < kol / 2; i++) {
                System.out.print(table[i] + ", " + table[kol - 1 - i] + ", ");
            }

            if (kol % 2 != 0) {
                System.out.print(table[kol / 2]);
            }
        }
    }





