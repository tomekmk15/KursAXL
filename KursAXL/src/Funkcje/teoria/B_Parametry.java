package Funkcje.teoria;

public class B_Parametry {
    
	static void ktomaco(String imie, String zwierze) {
    	System.out.println(imie + " ma " + zwierze);
	}
    
	static void wypiszElementyTablicy(int[] tablica, int poczatek, int koniec) {
    	for(int i = poczatek; i < koniec; i++) {
        	System.out.println(i + " → " + tablica[i]);
    	}
	}
    
	// za pomocą "przeciążania metod" (method overloading) można stworzyć metodę o tej samej nazwie,
	// ale z inną listą argumentów (inna liczba albo inne typy)
	// najczęstsze zastosowanie: werja tej samej metody z pominiętymi argumentami,
	// dla których przyjmowane są wartości domyślne
	static void wypiszElementyTablicy(int[] tablica, int koniec) {
    	wypiszElementyTablicy(tablica, 0, koniec);
	}
    
	static void wypiszElementyTablicy(int[] tablica) {
    	wypiszElementyTablicy(tablica, 0, tablica.length);
	}

	public static void main(String[] args) {
    	ktomaco("Ala", "kota");
    	ktomaco("Ola", "psa");
    	ktomaco("Sierotka", "rysia");
    	System.out.println();
   	 
    	int[] a = {5, 10, 15};
    	int[] b = {1, 11, 13, 9, 44, 100, -1, 0};
    	wypiszElementyTablicy(a, 1, 3);
    	System.out.println();
    	wypiszElementyTablicy(b, 2, 5);
	}

}
