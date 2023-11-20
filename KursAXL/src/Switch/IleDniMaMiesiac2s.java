package Switch;

import javax.swing.JOptionPane;

public class IleDniMaMiesiac2s {

	public static void main(String[] args) {
    	String miesiac = JOptionPane.showInputDialog("Podaj nazwę miesiąca");

    	switch(miesiac) {
        	case "styczeń":
        	case "marzec":
        	case "maj":
        	case "lipiec":
        	case "sierpień":
        	case "październik":
        	case "grudzień":
            	JOptionPane.showMessageDialog(null, miesiac + " ma 31 dni");
            	break;
        	case "kwiecień":
        	case "czerwiec":
        	case "wrzesień":
        	case "listopad":
            	JOptionPane.showMessageDialog(null, "30 dni");
            	break;
			case "luty":
				if(JOptionPane.showConfirmDialog(null, "Czy to jest rok przestępny?" , "Pytanie", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "29 dni");
				} else {
					JOptionPane.showMessageDialog(null, "28 dni");
				}
        	default:
            	JOptionPane.showMessageDialog(null, "Nieznany miesiąc " + miesiac, "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
	}

}
