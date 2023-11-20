package Switch;

import static javax.swing.JOptionPane.*;

public class IleDniMaMiesiac2 {

	public static void main(String[] args) {
    	String miesiac = showInputDialog("Podaj nazwę miesiąca");

    	switch(miesiac.toLowerCase()) {
        	case "styczeń":
        	case "marzec":
        	case "maj":
        	case "lipiec":
        	case "sierpień":
        	case "październik":
        	case "grudzień":
            	showMessageDialog(null, miesiac + " ma 31 dni");
            	break;
        	case "kwiecień":
        	case "czerwiec":
        	case "wrzesień":
        	case "listopad":
            	showMessageDialog(null, "30 dni");
            	break;
        	case "luty":
            	if(showConfirmDialog(null, "Czy to jest rok przestępny?" , "Pytanie", YES_NO_OPTION) == YES_OPTION) {
                	showMessageDialog(null, "29 dni");
            	} else {
                	showMessageDialog(null, "28 dni");
            	}
            	break;
        	default:
            	showMessageDialog(null, "Nieznany miesiąc " + miesiac, "Błąd", ERROR_MESSAGE);
    	}
	}

}
