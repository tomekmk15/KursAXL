package Switch;

import javax.swing.JOptionPane;

public class IleDniMaMiesiac3 {

	public static void main(String[] args) {
    	String miesiac = JOptionPane.showInputDialog("Podaj nazwę miesiąca");

    	switch(miesiac.toLowerCase()) {
        	case "styczeń", "marzec", "maj", "lipiec", "sierpień", "październik", "grudzień" ->
            	JOptionPane.showMessageDialog(null, miesiac + " ma 31 dni");
        	case "kwiecień", "czerwiec", "wrzesień", "listopad" ->
            	JOptionPane.showMessageDialog(null, "30 dni");
        	case "luty" -> {
            	int rok = Integer.parseInt(JOptionPane.showInputDialog("Podaj, który to rok"));
            	if(rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
                	JOptionPane.showMessageDialog(null, "29 dni");
            	} else {
                	JOptionPane.showMessageDialog(null, "28 dni");
            	}
        	}
        	default ->
            	JOptionPane.showMessageDialog(null, "Nieznany miesiąc " + miesiac, "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
	}

}
