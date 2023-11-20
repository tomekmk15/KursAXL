package Petle.zadania;

import java.util.Scanner;

public class PowtorzNapis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz linie text");
        String tekxt = scanner.nextLine();
        System.out.println("How many times should I repeat this text?");
        int howManyTimes = scanner.nextInt();

        for (int i = 0; i < howManyTimes; i++) {
            System.out.println(tekxt);
        }
    }
    }

