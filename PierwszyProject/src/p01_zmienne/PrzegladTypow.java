package p01_zmienne;

import java.time.LocalDateTime;

public class PrzegladTypow {

	public static void main(String[] args) {
		// 8 typów prostych:
		// liczby calkowite: byte, short, int, long
		byte b = 100;
		short s = 1000;
		int i = 23;
		long l = 333;
		System.out.println(b * s * i * l);

		// 2 typy dla liczb z ułamkiem. liczby "zmiennopozycyjne" / "zmiennoprzeconkowe" (floating point)
		float f = 3.14F;
		double d = 123.456;
		System.out.println(f * d);
		System.out.println();

		// char - pojedynczy znak, ale patrząc technicznie, to jest liczba 16-bitowa, która może być kodem znaku
		char c = 'A';
		System.out.println(c);
		System.out.println(c + 1); // kodem litery A jest 65
		c++;
		// teraz jednak "przesuwamy znak" o jedną pozycję do przodu
		System.out.println(c);

		boolean warunek = true;
		System.out.println(warunek);
		warunek = f < 3;
		System.out.println(warunek);
		// przy okazji dwa sposoby umieszczania egzotycznych znaków w napisach:
		if (warunek) {
			System.out.println("\u03C0 jest małe");
		} else {
			System.out.println("π jest duże");
		}
		System.out.println();

		// Typy obiektowe: klasa, interfejs, enum, rekord oraz tablice
		// Sama Java definiuje ich kilka tysięcy, a programiści mogą tworzyć własne
		String napis = "Ala ma kota";
		System.out.println(napis);
		System.out.println(napis.toUpperCase());

		LocalDateTime czas = LocalDateTime.now();
	}
}