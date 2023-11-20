
import java.time.LocalTime;
import java.util.List;

public class Var {

	public static void main(String[] args) {
    	// auto y = 123; // C++

    	// Od Java 10 można nie pisać, jakiego typu jest zmienna, tylko podczas deklaracji użyć słowa var.
    	// Ale uwaga, to działa tylko pod pewnymi warunkami.
    	var x = 1000;
    	System.out.println(x);
    	x++;
    	System.out.println(x);
   	 
    	// Teraz x jest typu int. O wybranym typie decyduje wartość wpisana podczas deklaracji.
    	// Można wpisać inną wartość typu int:
    	x = 5432;
    	System.out.println(x);
   	 
    	// Ale nie można wpisać wartości innego typu
    	// x = "Ala ma kota";
    	// System.out.println(x);
   	 
    	// var nie można używać bez wpisania wartości, nie używa się dla deklarowania pól w klasach.
    	//ERR var niewiemco;
   	 
    	// Namiastką zmiennej, do której można wpisać wszystko (jak w Pythonie lub PHP),
    	// w Javie jest typ Object
    	Object o;
    	o = "Ola ma psa";
    	System.out.println(o + " , obiekt klasy " + o.getClass().getSimpleName());
    	o = LocalTime.now();
    	System.out.println(o + " , obiekt klasy " + o.getClass().getSimpleName());
    	o = List.of("Ala", "Ola", "Ela");
    	System.out.println(o + " , obiekt klasy " + o.getClass().getSimpleName());
    	o = 1234;
    	System.out.println(o + " , obiekt klasy " + o.getClass().getSimpleName());
    	o = 3.14;
    	System.out.println(o + " , obiekt klasy " + o.getClass().getSimpleName());
	}

}
