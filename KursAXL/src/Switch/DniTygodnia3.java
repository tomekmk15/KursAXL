package Switch;

import javax.swing.JOptionPane;

public class DniTygodnia3 {
	/* W Java 14 pojawiły się nowe możliwości dla switch.
 	* Jedną z nich jest wpisanie za case znaków -> zamiast :
 	* powoduje to, że wykona się tylko jeden case i nie trzeba pisać break, aby przerwać.
 	* Za strzałką może być albo jedna instrukcja;  albo {blok}
 	*/
	public static void main(String[] args) {
    	int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));
   	 
    	switch(numer) {
        	case 1 ->
            	JOptionPane.showMessageDialog(null, "To jest poniedziałek");
        	case 2 ->
            	JOptionPane.showMessageDialog(null, "To jest wtorek");
        	case 3 ->
            	JOptionPane.showMessageDialog(null, "To jest środa");
        	case 4 ->
            	JOptionPane.showMessageDialog(null, "To jest czwartek");
        	case 5 -> {
            	JOptionPane.showMessageDialog(null, "To jest piątek");
            	JOptionPane.showMessageDialog(null, "Weekendu początek");
        	}
        	case 6 ->
            	JOptionPane.showMessageDialog(null, "To jest sobota");
        	case 7 ->
            	JOptionPane.showMessageDialog(null, "To jest niedziela");
        	default ->
            	JOptionPane.showMessageDialog(null, "Niepoorawny numer", "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
    	JOptionPane.showMessageDialog(null, "Koniec programu");
	}

}
