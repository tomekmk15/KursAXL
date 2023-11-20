package Petle.zadania;

public class KwadratySzesciany2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int kwadrat = i * i;
            int szescian = i * i * i;
            System.out.printf("%3d %5d %7d\n", i, kwadrat, szescian);
        }
    }
}


