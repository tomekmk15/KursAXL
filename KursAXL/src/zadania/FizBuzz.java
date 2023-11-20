package zadania;

import java.util.Scanner;

public class FizBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj limit: ");
        int limit = scanner.nextInt();

        boolean[] printed = new boolean[limit + 1];
        int count = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizz Buzz: " + i);
                count ++;


            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
                count ++;

            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
                count ++;

            }else {
                System.out.println(i);
            }



        }
        System.out.println(" Ile liczb bylo : " + count);

    }
}