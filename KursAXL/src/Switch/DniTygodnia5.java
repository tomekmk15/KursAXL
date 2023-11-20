package Switch;



import javax.swing.JOptionPane;

public class DniTygodnia5 {
	/* W Javie 14 pojawiła się konstrukcja "switch expression".
	 * Taki switch zwraca jeden z podanych wyników na zasadach podobnych do funkcji, ale nie wymaga tworzenia oddzielnej funkcji.
	 */
	public static void main(String[] args) {
		int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));

		String nazwa = switch(numer) {
			case 1 -> "poniedziałek";
			case 2 -> "wtorek";
			case 3 -> "środa";
			case 4 -> "czwartek";
			case 5 -> "piątek";
			case 6 -> "sobota";
			case 7 -> "niedziela";
			default -> "niepoprawny numer";
		};
		JOptionPane.showMessageDialog(null, "To jest " + nazwa);
	}

}


