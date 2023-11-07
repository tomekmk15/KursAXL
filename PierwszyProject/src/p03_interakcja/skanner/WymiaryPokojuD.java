package p03_interakcja.skanner;

import java.util.Scanner;

public class WymiaryPokojuD {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Podaj wymiary pomieszczenia");
    	System.out.print(" * długość: ");
    	double a = sc.nextDouble();
    	System.out.print(" * szerokość: ");
    	double b = sc.nextDouble();
   	 
    	double pole = a * b;
    	double obwod = 2*a + 2*b;

    	System.out.printf("Pole jest równe %.3f m² a obwód %.3f mb.\n", pole, obwod);
	}

}
