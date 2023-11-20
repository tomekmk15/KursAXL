package t01_Zmienne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* W tej wersji:
 * - do listy zbieramy wszystkie informacje o napotkanych problemach
 * - na końcu sprawdzamy czy w ogóle były błędy i jeśli tak, wypisujemy je na ekran
 * Ten schemat przypomina technikę stosowaną w testach automatycznych o nazwie "error log".
 */
public class Bagaz6 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
    	double a = scanner.nextDouble();
    	double b = scanner.nextDouble();
    	double c = scanner.nextDouble();
    	double obj = a * b * c;
   	 
    	List<String> listaBledow = new ArrayList<>();

    	if(a > 50) {
        	listaBledow.add("Zbyt duża długość");
    	}
    	if(b > 50) {
        	listaBledow.add("Zbyt duża szerokość");
    	}
    	if(c > 50) {
        	listaBledow.add("Zbyt duża wysokość");
    	}
    	if(obj > 50_000) {
        	listaBledow.add("Zbyt duża objętość");
    	}
   	 
    	if(listaBledow.isEmpty()) {
        	System.out.println("Bagaż mieści się w wymaganiach");
    	} else {
        	System.out.println("Bagaż odrzucony. Błędy:");
        	for(String blad : listaBledow) {
            	System.out.println(" * " + blad);
        	}
    	}
	}

}
