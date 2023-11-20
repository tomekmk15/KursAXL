package Switch;

import javax.swing.JOptionPane;

public class DniTygodnia1 {

	/* switch przechodzi do tego case, którego wartość została przekazana w parametrze
 	* i od tego miejsca kontynuuje wykonanie do samego końca
 	* albo do napotkania instrukcji break (która powoduje wyjście ze switcha).
 	*
 	* W tej wersji pomiędzy case'ami nie ma breaków, dlatego wykonują się dalsze instrukcje aż do końca.
 	*/
	public static void main(String[] args) {
    	int numer = Integer.parseInt(JOptionPane.showInputDialog("Podaj nr dnia tygodnia"));
   	 
    	switch(numer) {
        	case 1:
            	JOptionPane.showMessageDialog(null, "To jest poniedziałek");
        	case 2:
            	JOptionPane.showMessageDialog(null, "To jest wtorek");
        	case 3:
            	JOptionPane.showMessageDialog(null, "To jest środa");
        	case 4:
            	JOptionPane.showMessageDialog(null, "To jest czwartek");
        	case 5:
            	JOptionPane.showMessageDialog(null, "To jest piątek");
            	JOptionPane.showMessageDialog(null, "Weekendu początek");
        	case 6:
            	JOptionPane.showMessageDialog(null, "To jest sobota");
        	case 7:
            	JOptionPane.showMessageDialog(null, "To jest niedziela");
        	default:
            	JOptionPane.showMessageDialog(null, "Niepoorawny numer", "Błąd", JOptionPane.ERROR_MESSAGE);
    	}
    	JOptionPane.showMessageDialog(null, "Koniec programu");
	}

}
