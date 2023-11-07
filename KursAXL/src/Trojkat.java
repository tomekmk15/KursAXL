import java.util.Scanner;
import java.lang.Math;

public class Trojkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Podaj długość pierwszego boku trojkąta:");
        double a = input.nextDouble();
        
        System.out.println("Podaj długość drugiego boku trojkąta:");
        double b = input.nextDouble();
        
        System.out.println("Podaj długość trzeciego boku trojkąta:");
        double c = input.nextDouble();
        
        if (czyMoznaUlozycTrojkat(a, b, c)) {
            double pole = obliczPoleTrojkata(a, b, c);
            System.out.println("Można utworzyć trójkąt o podanych bokach.");
            System.out.println("Pole powierzchni tego trójkąta wynosi: " + pole);
        } else {
            System.out.println("Z podanych boków nie można utworzyć trójkąta.");
        }
        
        input.close();
    }
    
    public static boolean czyMoznaUlozycTrojkat(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    public static double obliczPoleTrojkata(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
