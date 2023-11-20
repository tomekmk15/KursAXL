package Funkcje.teoria;

public class A_Wprowadzenie {
    
	static void aaa() {
    	System.out.println("aaa, kotki dwa...");
	}

	public static void main(String[] args) {
    	System.out.println("Początek programu");
    	aaa();
    	aaa();
    	// to działa: p07_tablice.LosowaTablica.main(args);
    	bbb();

    	System.out.println("Koniec programu");
	}
    
	static void bbb() {
    	System.out.println("bebe, zaraz napiszę coś o kotkach");
    	aaa();
    	System.out.println("Koniec bbb");
    	System.out.println();
	}
    
	static void nikt_mnie_nie_wywola() {
    	System.out.println("To się nigdzie nie wypisze");
	}
}
