package Petle.teoria;

public class Petle {
    public static void main(String[] args) {
        System.out.println("Początek programu");

        System.out.println("Pętla while:");
        int a = 1;
        while(a < 5) {
            System.out.println("a = " + a);
            a++;
        }
        System.out.println("Koniec pętli while. Teraz a = " + a);
        System.out.println("----------------\n");

        System.out.println("Pętla do-while:");
        int b = 1;
        do {
            System.out.println("b = " + b);
            b++;
        } while(b < 5);
        System.out.println("Koniec pętli do-while. Teraz b = " + b);
        System.out.println("----------------\n");

        System.out.println("Peetla for");

        System.out.println("Pętla for:");
        for(int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Koniec pętli for.");
        //NK System.out.println("Teraz i = " + i);
        System.out.println("----------------\n");

        String[] tablica = {"Java", "Python", "JS", "C++"};
        for(String element : tablica) {
            System.out.println(" * " + element);
        }
        System.out.println("Koniec pętli for-each.");
        System.out.println("----------------");
        System.out.println("Koniec programu");
    }
}




