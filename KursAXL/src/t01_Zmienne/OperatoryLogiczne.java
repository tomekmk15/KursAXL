package t01_Zmienne;

import java.util.Random;

public class OperatoryLogiczne {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(20);
		int y = random.nextInt(20);
		System.out.println("x = " + x + " , y = " + y);

		// operatory porównania
		System.out.println("Operatory porównania. Wypisuję stwierdzenia, które są prawdą...");
		if (x == y) {
			System.out.println("x == y");
		}
		if (x != y) {
			System.out.println("x != y");
		}
		if (x < y) {
			System.out.println("x <  y");
		}
		if (x <= y) {
			System.out.println("x <= y");
		}
		if (x > y) {
			System.out.println("x >  y");
		}
		if (x >= y) {
			System.out.println("x >= y");
		}
		System.out.println();

		// Powyższe porównania działają dla typów prostych liczbowych (np. int, double).
		// Porównywanie obiektów odbywa się w inny sposób.
		// W Javie napis (String) jest obiektem.
		String napis1 = "ala ma kota";
		String napis2 = "Ala Ma Kota".toLowerCase();
		System.out.println(napis1);
		System.out.println(napis2);
		// napisy zawierają ten sam tekst, ale zostały uzyskane w inny sposób.
		if (napis1 == napis2) {
			System.out.println("== powiedziało że napisy są równe");
		} else {
			System.out.println("== powiedziało że napisy NIE są równe");
		}
	}
}
		// Okazuje się, że operatory == i != stosowane do obiektów sprawdzają
		// czy to jest TEN SAM OBIEKT W PAMIĘCI, czy obie wartości znajdują się POD