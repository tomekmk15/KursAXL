package p01_zmienne;

import javax.swing.JOptionPane;

/*
Program zadaje trzy pytania:
- Co chcesz kupić (użytkownik podaje nazwę towaru)
- Ile kosztuje jedna sztuka
- Ile sztuk kupujesz

Następnie program oblicza, jaka będzie kwota do zapłaty, i wypisuje komunikat postaci
Za 6 sztuk towaru kapusta zapłacisz 12.0 zł.

(tutaj wpisuję przykładową nazwę i cenę, a program ma wpisać dane podane przez usera)
*/

public class Zakupy {

	public static void main(String[] args) {
    	String towar = JOptionPane.showInputDialog("Co chcesz kupić?");
    	double cena = Double.parseDouble(JOptionPane.showInputDialog("Ile kosztuje jedna sztuka " + towar + "?"));
    	int sztuk = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę sztuk"));
    	double kwota = cena * sztuk;
    	JOptionPane.showMessageDialog(null, "Za " + sztuk + " sztuk towaru " + towar + " zapłacisz " + kwota + " zł");


		// wersja zaokrąglająca wynik:
		JOptionPane.showMessageDialog(null, String.format(
				"Za %d sztuk towaru %s zapłacisz %.2f", sztuk, towar, kwota));
	}



    
}
