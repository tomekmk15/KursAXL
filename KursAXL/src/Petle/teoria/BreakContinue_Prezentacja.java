package Petle.teoria;

import javax.swing.JOptionPane;

public class BreakContinue_Prezentacja {

	public static void main(String[] args) {
    	int licznik = 0;

    	while(true) {
        	licznik++;
        	JOptionPane.showMessageDialog(null, "Początek pętli, licznik = " + licznik);
        	int odp1 = JOptionPane.showConfirmDialog(null, "Czy zrobić break?");
        	if(odp1 == JOptionPane.YES_OPTION) {
            	break;
            	// break w pętli powoduje natychmiastowe zakończenie tej pętli i przejście do następnej instrukcji za pętlą
        	}
        	JOptionPane.showMessageDialog(null, "Środek pętli. Nie było break.");

        	int odp2 = JOptionPane.showConfirmDialog(null, "Czy zrobić continue?");
        	if(odp2 == JOptionPane.YES_OPTION) {
            	continue;
            	// continue powoduje pominięcie reszty instrukcji w bieżącym obrocie pętli
            	// i przejście od razu na początek następnego obrotu
        	}
        	JOptionPane.showMessageDialog(null, "Koniec pętli, nie było break ani continue");
    	}

    	JOptionPane.showMessageDialog(null, "Koniec programu");
	}

}
