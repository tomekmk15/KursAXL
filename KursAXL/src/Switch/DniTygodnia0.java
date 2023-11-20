package Switch;

import javax.swing.JOptionPane;

public class DniTygodnia0 {

	public static void main(String[] args) {
    	int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));
   	 
    	if(numer == 1) {
        	JOptionPane.showMessageDialog(null, "To jest poniedziałek");
    	} else if(numer == 2) {
        	JOptionPane.showMessageDialog(null, "To jest wtorek");
    	} else if(numer == 3) {
        	JOptionPane.showMessageDialog(null, "To jest środa");
    	} else if(numer == 4) {
        	JOptionPane.showMessageDialog(null, "To jest czwartek");
    	} else if(numer == 5) {
        	JOptionPane.showMessageDialog(null, "To jest piątek");
        	JOptionPane.showMessageDialog(null, "Weekendu początek");
    	} else if(numer == 6) {
        	JOptionPane.showMessageDialog(null, "To jest sobota");
    	} else if(numer == 7) {
        	JOptionPane.showMessageDialog(null, "To jest niedziela");
    	} else {
        	JOptionPane.showMessageDialog(null, "Niepoorawny numer", "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
	}

}
