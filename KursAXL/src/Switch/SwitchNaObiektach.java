package Switch;

import java.io.File;
import java.time.LocalDate;

public class SwitchNaObiektach {

	public static void main(String[] args) {
    	Object jakisObiekt;
//    	jakisObiekt = "owca";
//    	jakisObiekt = "koza";
//    	jakisObiekt = new File("sciezka/do/pliku.txt");
    	jakisObiekt = LocalDate.of(1997, 8, 19);
   	 
    	switch(jakisObiekt) {
        	case String s when s.startsWith("o") -> System.out.println("To jest napis na o:" + s);
        	case String s when s.startsWith("k") -> System.out.println("To jest napis na k:" + s);
        	case String s when s.equalsIgnoreCase("java") -> System.out.println("To jest napis JAVA");
        	case String s -> System.out.println("To jest inny napis: " + s);
        	case File f -> System.out.println("To jest plik " + f.getAbsolutePath());
        	case LocalDate dt -> System.out.println("To jest data " + dt + " (dzień tygodnia " + dt.getDayOfWeek() +")");
        	case null -> System.out.println("Nie ma nic");
        	default -> System.out.println("Nie wiem co to jest. Ale klasą jest " + jakisObiekt.getClass());
    	}
	}

}

//        	case "owca" -> System.out.println("To jest owieczka");
//        	case "koza" -> System.out.println("To jest kózka");