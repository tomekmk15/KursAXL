package t01_Zmienne;

import java.util.Random;

public class OperatorWarunkowy {

	public static void main(String[] args) {
    	Random random = new Random();
    	int x = random.nextInt(20);
    	int y = random.nextInt(20);
    	System.out.println("x = " + x + " , y = " + y);
   	 
    	// Zamiast pisać takiego ifa:
    	String a;
    	if(x > y) {
        	a = "iks";
    	} else {
        	a = "igrek";
    	}
    	System.out.println("Większą z tych liczb jest " + a);
   	 
    	// ...można użyć operatora warunkowego ? :
    	String b = x > y ? "IKS" : "IGREK";
    	System.out.println("Większą z tych LICZB jest " + b);

    	// wersja rozpatrująca 3 przypadki:
    	System.out.println("Precyzyjnie mówiąc "
            	+ (x > y ? "większy jest x" : x < y ? "większy jest y" : "liczby są równe"));
   	 
	}

}
