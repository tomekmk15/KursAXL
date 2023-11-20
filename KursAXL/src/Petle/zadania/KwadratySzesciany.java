package Petle.zadania;

public class KwadratySzesciany {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int kwadrat = i * i;
            int szescian = i * i * i;
            System.out.println(i + " " + kwadrat + " " + szescian);
        }
    }
}


