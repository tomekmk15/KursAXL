package Petle.zadania;

import java.util.Scanner;

public class TabliczkMnozeniaProba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wys");
        int wys = scanner.nextByte();

        System.out.println("podaj szer");


        int szer = scanner.nextInt();

        String format = "%" + String.valueOf(wys + szer).length() + "d";


        for (int i = 1; i <= wys; i++) {
            for (int k = 1; k <= szer; k++) {
                System.out.print((i * k) + "\t");
            }
            System.out.println();
        }
    }
}


