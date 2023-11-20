package p03_interakcja.skanner;

import java.io.IOException;
import java.util.Arrays;

public class SuroweWejscie2 {
	public static void main(String[] args) throws IOException {
    	System.out.println("Napisz coś");

    	// Można też wczytać całą porcję bajtów do tablicy
    	byte[] bajty = new byte[100];
    	int ile = System.in.read(bajty);

    	System.out.println("Odczytano " + ile + " bajtów.");
    	System.out.println(Arrays.toString(bajty));

    	// Można utworzyć napis na podstawie ciągu bajtów:

    	String napis = new String(bajty, 0, ile);
    	// String napis = new String(bajty, 0, ile, "UTF-8");
    	System.out.println("Napisałeś: " + napis);
	}
}
