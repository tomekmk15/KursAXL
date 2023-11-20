package t01_Zmienne;

import java.util.Scanner;

/* W tej wersji:
 * - jeśli wystepuje kilka błędów, to wypiszemy info o każdym z nich
 * - dzięki zmiennej logicznej `bylyBledy` na końcu będziemy wiedzieć czy wystapił jakikolwiek błąd
 */
public class Bagaz5 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
    	double a = scanner.nextDouble();
    	double b = scanner.nextDouble();
    	double c = scanner.nextDouble();
    	double obj = a * b * c;
    	boolean bylyBledy = false;

    	if(a > 50) {
        	System.out.println("Zbyt duża długość");
        	bylyBledy = true;
    	}
    	if(b > 50) {
        	System.out.println("Zbyt duża szerokość");
        	bylyBledy = true;
    	}
    	if(c > 50) {
        	System.out.println("Zbyt duża wysokość");
        	bylyBledy = true;
    	}
    	if(obj > 50_000) {
        	System.out.println("Zbyt duża objętość");
        	bylyBledy = true;
    	}
   	 
    	if(bylyBledy) {
        	System.out.println("Bagaż odrzucony");
    	} else {
        	System.out.println("Bagaż mieści się w wymaganiach");
    	}
	}

}
