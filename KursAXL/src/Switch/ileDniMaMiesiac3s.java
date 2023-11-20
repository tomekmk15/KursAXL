package Switch;

import javax.swing.JOptionPane;

public class ileDniMaMiesiac3s {

	public static void main(String[] args) {
    	String miesiac = JOptionPane.showInputDialog("Podaj nazwę miesiąca");

    	switch(miesiac) {
        	case "styczeń", "marzec", "maj", "lipiec", "sierpień", "październik", "grudzień" ->
            	JOptionPane.showMessageDialog(null, miesiac + " ma 31 dni");
        	case "kwiecień", "czerwiec", "wrzesień", "listopad" ->
            	JOptionPane.showMessageDialog(null, "30 dni");
        	case "luty" ->
            	JOptionPane.showMessageDialog(null, "28 lub 29 dni");
        	default ->
            	JOptionPane.showMessageDialog(null, "Nieznany miesiąc " + miesiac, "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
	}

}

