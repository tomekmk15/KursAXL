package p01_zmienne;

import javax.swing.JOptionPane;

public class PoleTrapezu3 {

	public static void main(String[] args) {
    	// W tej wersji pobieramy dane wejściowe od użytkownika.
    	// double a = 10, b = 15, h = 7;
   	 
    	double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj pierwszą podstawę trapezu"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Podaj pierwszą podstawę trapezu"));
		double h = Double.parseDouble(JOptionPane.showInputDialog("Podaj pierwszą podstawę trapezu"));
    	double pole = (a+b) * h / 2;
		JOptionPane.showMessageDialog (null, "Pole wynosi " + pole + " cm²");
   	 
	}

}
