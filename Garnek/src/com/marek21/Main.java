package com.marek21;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Garnek garnek = new Garnek(1,2,3,"druslak");

//       garnek.nazwa = "druslak";
//
//        System.out.println(garnek.pojemnosc);
//        System.out.println(garnek.iloscWody);
//        System.out.println(garnek.iloscMleka);
//        System.out.println(garnek.nazwa);
        int temp = garnek.temp();
        System.out.println(temp);

        String gotowanie2 = garnek.gotowanieZSola(true);
        System.out.println(gotowanie2);
//


    }


}





