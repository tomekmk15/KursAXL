package zadania;

import java.util.Random;
import java.util.Scanner;

public class Gra1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("losuj liczbe (od 1 do 10): ");
        int liczba = random.nextInt(10);
        int liczba2 = random.nextInt(10);

        System.out.println("wylosowana liczba to:  " + liczba);
        System.out.println("wylosowana liczba to:  " + liczba2);

        System.out.println("Ile wynosi iloczyn ? : " + liczba + " * " + liczba2);
        int liczba3 = scanner.nextInt();
        System.out.println();

        if (liczba3 == liczba * liczba2){

            System.out.println("prawidlowy wynik");

        }  else {
            System.out.println("nie prawidlowa");
            System.out.println(liczba  + " * " + liczba2 + " = " + liczba2 * liczba);
        }

    }
}
