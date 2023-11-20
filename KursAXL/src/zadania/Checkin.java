package zadania;

import java.util.Scanner;

public class Checkin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("pdaj wymiary walizki: ");
        double wysoksc = scanner.nextDouble();
        double szerokosc = scanner.nextDouble();
        double wysokosc = scanner.nextDouble();

        if ( wysoksc <=  50 && szerokosc <= 50 && wysoksc <= 50 && wysoksc * szerokosc * wysoksc <= 50_000){

            System.out.println("wymiary mieszcza sie");

        } else {

            System.out.println("wymiARY NIE MIESCCZA SIE");
        }





    }
}
