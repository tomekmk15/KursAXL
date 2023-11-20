package p01_zmienne;

public class Ciekawostki {

    public static void main(String[] args) {
   	 // Liczby całkowite mają ograniczony zakres,
   	 // a wyjście poza ten zakres (gdy wynik obliczenia nie mieści się w zakresie)
   	 // daje w efekcie "integer overflow", czyli przekręcenie licznika
   	 int miliard = 1_000_000_000;
   	 System.out.println(2 * miliard);
   	 System.out.println(3 * miliard);
   	 System.out.println(5 * miliard); // typ int - granica to nieco ponad 2 mld
   	 System.out.println(5L * miliard); // typ long
   	 System.out.println(10L * miliard * miliard); // ale long też ma swój limit
   	 // To jest bardzo groźne, bo wychodzi błędny wynik i program działa dalej, ale pracuje na niepoprawnych danych.
   	 // efekt: Ariane 5
   	 
   	 // Sposób na obsługę liczb całkowitych bez limitu: BigInteger.
   	 System.out.println();
   	 
   	 // Obliczenia na liczbach zmiennoprzecinkowych (float oraz double) są nieprecyzyjne.
   	 // Wewnętrznie liczba zapisana jest w systemie dwójkowym, a nie każdy ułamek dziesiętny da się w ten sposób zapisać.
   	 // Liczby są pamiętane "w lekkim zniekształceniu", a niektóre operacje mogą ten błąd kumulować i staje się on coraz bardziej zauważalny.
   	 double cena = 1.2;
   	 System.out.println(3 * cena);
   	 System.out.println();
   	 
   	 // Sposób na obsługę liczb z ułamkiem dziesiętnym bez pomyłek: BigDecimal.
   	 // Zalecany sposób liczenie pieniędzy w Javie.
   	 
   	 
   	 int x = 0321;
   	 // System ósemkowy (oktalny), czyli to jest równe 3×8² + 2×8 + 1 = 192 + 16 + 1 = 209
   	 System.out.println("x = " + x);
   	 
   	 System.out.println();
   	 
   	 x = 19;
   	 System.out.println(x / 5);
   	 // Dzielenie całkowite (gdy l.całkowitą dzielimy przez całkowitą) daje w wyniku część całkowitą ilorazu.
   	 // Część ułamkowa jest odrzucana; to nie jest zaokrąglenie, tylko obcięcie.
    }

}
