package zadania;

public class SredniaOcen {
    public static void main(String[] args) {
        int[] oceny = {5, 5, 3, 2, 6, 5};
        int suma = 0;

        for (int i = 0; i < oceny.length; i++) {
            suma += oceny[i];
        }

        double srednia = (double) suma / oceny.length;
        System.out.println("srednia: " + srednia);
    }
}



