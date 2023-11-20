package Switch;

import javax.swing.JOptionPane;

public class IleDniMaMiesiac5 {
	/* Zwracamy liczbę dni za pomocą switch expression.
	 * W przypadku lutego musimy sprawdzić dodatkowe warunki - w tej wsytuacji wynik switch expr podaje się za pomocą instrukcji yield.
	 */
	public static void main(String[] args) {
		String miesiac = JOptionPane.showInputDialog("Podaj nazwę miesiąca");

		int ileDni = switch(miesiac.toLowerCase()) {
			case "styczeń", "marzec", "maj", "lipiec", "sierpień", "październik", "grudzień" -> 31;
			case "kwiecień", "czerwiec", "wrzesień", "listopad" -> 30;
			case "luty" -> {
				int rok = Integer.parseInt(JOptionPane.showInputDialog("Podaj, który to rok"));
				if(rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
					yield 29;
				} else {
					yield 28;
				}
			}
			default -> 0;
		};

		JOptionPane.showMessageDialog(null, miesiac + " ma " + ileDni + " dni");
	}

}

