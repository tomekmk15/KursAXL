package t01_Zmienne;

import java.util.Scanner;

/* W tej wersji:
 * - rozbijamy warunki do oddzielnych if-ów, aby program napisał dlaczego bagaż został odrzucony
 * - ważne jednak, aby program ostatecznie potwierdził akceptację bagażu, lub napisał jednoznacznie, że odrzuca
 * - program wypisuje tylko pierwszą przyczynę odrzucenia
 * - sprawdzanie warunków pozytywnych prowadzi tutaj do powstania kodu wielokrotnie zagnieżdżonego
 *   (if w ifie i kolejnym ifie...)
 *   "else jest daleko od swojego if-a"
 */
public class Bagaz3 {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
    	double a = scanner.nextDouble();
    	double b = scanner.nextDouble();
    	double c = scanner.nextDouble();
    	double obj = a * b * c;

    	if(a <= 50) {
        	if(b <= 50) {
            	if(c <= 50) {
                	if(obj <= 50_000) {
                    	System.out.println("Bagaż mieści się w wymaganiach");
                	} else {
                    	System.out.println("Zbyt duża objętość");
                	}
            	} else {
                	System.out.println("Zbyt duża wysokość");
            	}
        	} else {
            	System.out.println("Zbyt duża szerokość");
        	}
    	} else {
        	System.out.println("Zbyt duża długość");
    	}
	}

}
