package Tablice.teoria;

import java.util.Arrays;

public class A_Wprowadzenie {

    public static void main(String[] args) {
   	 // Zamiast tworzyć wiele podobnych zmiennych tego samego typu...:
   	 String miasto0 = "Warszawa";
   	 String miasto1 = "Kraków";
   	 String miasto2 = "Wrocław";
   	 String miasto3 = "Poznań";
   	 String miasto4 = "Łódź";
   	 
   	 System.out.println("miasto0 = " + miasto0);
   	 
   	 // Mając takie zwykłe zmienne, nie ma jak wykonać operacji "dla wszystkich elementów na raz".
   	 // Takie podejście "nie skaluje się".
   	 
   	 // ...Można stworzyć "tablicę":
   	 String[] miasta = new String[5];
   	 // Początkowo w tak utworzonej tablicy są same nulle albo zera (w zależności od typu)
   	 System.out.println("miasta[0] = " + miasta[0]);
   	 
   	 // Z elementów tablicy można korzystać, jak ze zwykłych zmiennych:
   	 miasta[0] = "Warszawa";
   	 miasta[1] = "Kraków";
   	 miasta[2] = "Wrocław";
   	 miasta[3] = "Poznań";
   	 miasta[4] = "Łódź";

   	 System.out.println("miasta[0] = " + miasta[0]);
   	 System.out.println();
   	 
   	 // Ale mając tablicę wartości, można już wykonywać operacje na całej tablicy; na wszystkich elementach
   	 // Spróbujmy wypisać tablicę:
   	 System.out.println(miasta);
   	 // Aby zobaczyć elementy tablicy, najlepiej użyć Arrays.toString(t)
   	 System.out.println(Arrays.toString(miasta));
   	 
   	 miasta[2] = "Bydgoszcz";
   	 System.out.println(Arrays.toString(miasta));

   	 // Tablice w Javie "znają" swoją długość i przechowują ją w polu ".length"
   	 System.out.println(miasta.length);
   	 // Poprawne indeksy w tablicy to od 0 do length-1
   	 // Próba wyjścia poza zakres tablicy kończy się wyjątkiem
		try {
			System.out.println(miasta[5]);
			System.out.println(miasta[-1]);
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("Ostatni element: " + miasta[miasta.length-1]);
		System.out.println();

		// Tablic z pamięci się nie usuwa - zajmuje się tym JVM, a dokładnie "garbage collector" (gc)
	}

}
