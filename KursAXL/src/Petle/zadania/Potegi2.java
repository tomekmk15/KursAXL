package Petle.zadania;


public class Potegi2 {
    public static void main(String[] args) {
        int LIMIT = 1000000000;
        int potega = 1;
        
        while (potega < LIMIT) {
            System.out.println(potega);
            potega *= 2;
        }
        System.out.println("ostatnia: " +potega);
        System.out.println();

        // mozna w petli for

        for (int i = 1; i < LIMIT; i *=2 ){
            System.out.println(i);
        }
    }
}

