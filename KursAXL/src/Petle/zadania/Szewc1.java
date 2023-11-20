package Petle.zadania;

import javax.swing.JOptionPane;

public class Szewc1 {

	public static void main(String[] args) {
    	int poczatek = Integer.parseInt(JOptionPane.showInputDialog("Którego dnia oddajesz buty do naprawy? [1-7]"));
    	int czasNaprawy = Integer.parseInt(JOptionPane.showInputDialog("Ile dni potrwa naprawa?"));
    	int koniec = poczatek + czasNaprawy;
    	while(koniec > 7) {
        	koniec -= 7;
    	}
    	JOptionPane.showMessageDialog(null, "Buty będą do odbioru w dzień nr " + koniec);
	}

}
