package Funkcje.zadania;

public class FunkcjeNaTablicach1 {


    static int suma(int[] t) {
        int suma = 0;
        for(int element : t) {
            suma += element;
        }
        return suma;
    }

    // kolejna funkcja:
    // zwraca sumę tych elmeentów tablicy, które są liczbami parzystymi
    static int sumaParzystych(int[] t) {
        int sumaParzystych = 0;
        for (int element : t) {
            if (element % 2 == 0) {
                sumaParzystych += element;
            }
        }
        return sumaParzystych;

    }

    public static void main(String[] args) {
        int[] a = {3, 5, 7, 12, 16, 18};
        int[] b = {20, 15, 10};

        int wynik = suma(a);
        System.out.println("suma a: " + wynik);

        System.out.println("suma b: " + suma(b));


        System.out.println("suma b: " + sumaParzystych(b));
        System.out.println("suma b: " + sumaParzystych(b));


    }

}


