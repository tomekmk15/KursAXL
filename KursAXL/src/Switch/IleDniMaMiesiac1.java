package Switch;

import javax.swing.JOptionPane;

public class IleDniMaMiesiac1 {
	/*
 	Użytkownik podaje nazwę miesiąca, a program wypisuje info, ile dni ma ten miesiąc.

 	Wersja z tradycyjnym switch z break.
 	W tej wersji każdy miesiąc jest rozpatrywany niezależnie → dużo kodu się powtarza,
 	np. wypisywanie "31 dni" występuje aż 7 razy.
 	*/
	public static void main(String[] args) {
		String miesiac = JOptionPane.showInputDialog("Podaj nazwę miesiąca");

		switch (miesiac) {
			case "styczeń":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "luty":
				JOptionPane.showMessageDialog(null, "28 lub 29 dni");
				break;
			case "marzec":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "kwiecień":
				JOptionPane.showMessageDialog(null, "30 dni");
				break;
			case "maj":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "czerwiec":
				JOptionPane.showMessageDialog(null, "30 dni");
				break;
			case "lipiec":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "sierpień":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "wrzesień":
				JOptionPane.showMessageDialog(null, "30 dni");
				break;
			case "październik":
				JOptionPane.showMessageDialog(null, "31 dni");
				break;
			case "listopad":
				JOptionPane.showMessageDialog(null, "30 dni");
				break;
			case "grudzień":
		}
	}
}