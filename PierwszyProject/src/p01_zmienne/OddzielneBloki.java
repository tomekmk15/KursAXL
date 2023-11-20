package p01_zmienne;

public class OddzielneBloki {

    public static void main(String[] args) {
   	 // Blok kodu to fragment otoczony {nawiasami klamrowymi}
   	 {
   		 int x = 100;
   		 System.out.println(x);
   		 x += 5;
   		 System.out.println(x);   		 
   		 System.out.println(10 * x);
   	 }
   	 // po wyjściu z bloku zmienna x jest niedostępna
   	 //System.out.println(x);
   	 
   	 // w kolejnym bloku można znowu stworzyć zmienną x, nawet innego typu
   	 {
   		 String x = "Alicja ma kocura";
   		 System.out.println(x);
   		 // System.out.println(10 * x);
   		 System.out.println(x.toUpperCase());
   	 }
    }

}
