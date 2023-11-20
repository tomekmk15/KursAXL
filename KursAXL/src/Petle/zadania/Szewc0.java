import javax.swing.JOptionPane;

public class Szewc0 {

	public static void main(String[] args) {
    	int poczatek = Integer.parseInt(JOptionPane.showInputDialog("Którego dnia oddajesz buty do naprawy? [1-7]"));
    	int czasNaprawy = Integer.parseInt(JOptionPane.showInputDialog("Ile dni potrwa naprawa?"));
    	int koniec = poczatek + czasNaprawy;
    	JOptionPane.showMessageDialog(null, "Buty będą do odbioru w dzień nr " + koniec);
    	// Ta wersja działa poprawnie tylko w zakresie jednego tygodnia.
    	// Jeśli wynik wychodzi > 7, to nie zostanie sprowadzony do zakresu 1-7.
	}

}
