package Switch;

import javax.swing.JOptionPane;

public class DniTygodnia2 {
	/* Ta wersja pokazuje najbardziej klasyczny zapis switch, jaki działa w Javie od samego początku.
 	* Tak samo jest też w C, C++.
 	*
 	* Pod koniec każdego case'a jest break, który powoduje, że program nie przejdzie do następnego.
 	* break powoduje wyjście ze switch, ale break nie przerywa całego programu.
 	*/
	public static void main(String[] args) {
    	int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));
   	 
    	switch(numer) {
        	case 1:
            	JOptionPane.showMessageDialog(null, "To jest poniedziałek");
            	break;
        	case 2:
            	JOptionPane.showMessageDialog(null, "To jest wtorek");
            	break;
        	case 3:
            	JOptionPane.showMessageDialog(null, "To jest środa");
            	break;
        	case 4:
            	JOptionPane.showMessageDialog(null, "To jest czwartek");
            	break;
        	case 5:
            	JOptionPane.showMessageDialog(null, "To jest piątek");
            	JOptionPane.showMessageDialog(null, "Weekendu początek");
            	break;
        	case 6:
            	JOptionPane.showMessageDialog(null, "To jest sobota");
            	break;
        	case 7:
            	JOptionPane.showMessageDialog(null, "To jest niedziela");
            	break;
        	default:
            	JOptionPane.showMessageDialog(null, "Niepoorawny numer", "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
    	JOptionPane.showMessageDialog(null, "Koniec programu");
	}

}
