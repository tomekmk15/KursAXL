package Petle.zadania;

import java.util.Scanner;

public class KwadratySzesciany3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podasj limit");
        int limit = scanner.nextInt();
        // Z liczby tworzę stringa i mierzę długość tego stringa.
        int szer1 = String.valueOf(limit).length();
        int szer2 = String.valueOf(limit*limit).length();
        int szer3 = String.valueOf(limit*limit*limit).length();
        // Na podstawie tej wartości buduję "stringa formatującego" z odpowiednią szerokością kolumn
        String format = "%" + szer1 + "d %" + szer2 + "d %" + szer3 + "d%n";

        for(long i = 1; i <= limit; i++) {
            System.out.printf(format, i, i*i, i*i*i);

        }
    }
    }



