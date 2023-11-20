package p03_interakcja.skanner;

import java.io.IOException;

public class SuroweWejscie1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Napisz cos");
       int bajt = System.in.read();
        System.out.println("wczytana wartosc " + bajt);

    }
}
