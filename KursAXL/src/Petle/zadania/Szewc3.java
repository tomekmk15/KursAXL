package Petle.zadania;
import javax.swing.JOptionPane;
public class Szewc3 {

	public static void main(String[] args) {
    	int poczatek = Integer.parseInt(JOptionPane.showInputDialog("Którego dnia oddajesz buty do naprawy? [1-7]"));
    	int czasNaprawy = Integer.parseInt(JOptionPane.showInputDialog("Ile dni potrwa naprawa?"));
    	int koniec = (poczatek + czasNaprawy - 1) % 7 + 1; // wynikiem jest liczba od 1 do 7
    	JOptionPane.showMessageDialog(null, "Buty będą do odbioru w dzień nr " + koniec);
   	 
    	if(koniec == 1) {
        	JOptionPane.showMessageDialog(null, "To jest poniedziałek");
    	}
    	if(koniec == 2) {
        	JOptionPane.showMessageDialog(null, "To jest wtorek");
    	}
    	if(koniec == 3) {
        	JOptionPane.showMessageDialog(null, "To jest środa");
    	}
    	if(koniec == 4) {
        	JOptionPane.showMessageDialog(null, "To jest czwartek");
    	}
    	if(koniec == 5) {
        	JOptionPane.showMessageDialog(null, "To jest piątek");
    	}
    	if(koniec == 6) {
        	JOptionPane.showMessageDialog(null, "To jest sobota");
    	}
    	if(koniec == 7) {
        	JOptionPane.showMessageDialog(null, "To jest niedziela");
    	}
	}

}
