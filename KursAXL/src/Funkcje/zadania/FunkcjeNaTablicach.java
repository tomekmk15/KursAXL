package Funkcje.zadania;

public class FunkcjeNaTablicach {
    
	static int suma(int[] t) {
    	int suma = 0;
    	for(int element : t) {
        	suma += element;
    	}
    	return suma;
	}
    
	// kolejna funkcja:
	// zwraca sumę tych elementów tablicy, które są liczbami parzystymi
	static int sumaParzystych(int[] t) {
    	int suma = 0;
    	for(int element : t) {
        	if(element % 2 == 0) {
            	suma += element;
        	}
    	}
    	return suma;
	}
    
	static int sumaParzystych2(int[] t) {
    	int suma = 0;
    	for(int i = 0; i < t.length; i++) {
        	if(t[i] % 2 == 0) {
            	suma += t[i];
        	}
    	}
    	return suma;
	}

	public static void main(String[] args) {
    	int[] a = {3, 5, 7, 12, 16, 18};
    	int[] b = {20, 15, 10};
   	 
    	int wynik = suma(a);
    	System.out.println("suma a: " + wynik);
    	System.out.println("suma b: " + suma(b));
    	System.out.println("sumaP a: " + sumaParzystych(a));
    	System.out.println("sumaP b: " + sumaParzystych(b));
   	 
	}

}
