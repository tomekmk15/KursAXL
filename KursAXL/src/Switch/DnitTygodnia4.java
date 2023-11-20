package Switch;


import javax.swing.JOptionPane;

public class DnitTygodnia4 {
	/* Gdy switcha umieścimy w oddzielnej funkcji, w której w poszczególnych case'ach zwracamy różne wyniki,
	 * to nawet w starej wersji switch (sprzed Javy 14) nie trzeba pisać breaków.
	 */
	static String nazwaDniaTygodnia(int numer) {
		switch(numer) {
			case 1: return "poniedziałek";
			case 2: return "wtorek";
			case 3: return "środa";
			case 4: return "czwartek";
			case 5: return "piątek";
			case 6: return "sobota";
			case 7: return "niedziela";
			default: return "niepoprawny numer";
		}
	}

	public static void main(String[] args) {
		int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));
		String nazwa = nazwaDniaTygodnia(numer);
		JOptionPane.showMessageDialog(null, "To jest " + nazwa);
	}

}

