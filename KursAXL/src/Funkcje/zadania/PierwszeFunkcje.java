package Funkcje.zadania;

public class PierwszeFunkcje {
    
	static void powtorzNapis(String napis, int ileRazy) {
    	// na ekran ma wypisać podany napis tyle razy, ile mówi drugi argument
    	for(int i = 0; i < ileRazy; i++) {
        	System.out.println(napis);
    	}
	}
    
	static void ktoraWieksza(int lewa, int prawa) {
    	// wypisz na ekran info, która liczba jest większa, lewa czy prawa
    	// np. "Lewa liczba jest większa"
    	if(lewa > prawa) {
        	System.out.println("lewa liczba jest większa");
    	} else if (lewa < prawa) {
        	System.out.println("prawa liczba jest większa");
    	} else {
        	System.out.println("liczby są równe");
    	}
	}

	public static void main(String[] args) {
    	powtorzNapis("Ala ma kota", 5);
    	System.out.println("========\n");
   	 
    	powtorzNapis("Ola ma psa", 7);
    	System.out.println("========\n");
   	 
    	ktoraWieksza(11, 7);
    	ktoraWieksza(11, 19);
    	ktoraWieksza(15, 15);
	}

}
