package com.marek21;

public class Garnek {

    static int pojemnosc;
    static int iloscWody;
    static int iloscMleka;
    static String nazwa;

    public Garnek() {
    }
    public Garnek(int pojemnosc, int iloscWody, int iloscMleka, String nazwa) {
        this.pojemnosc = pojemnosc;
        this.iloscWody = iloscWody;
        this.iloscMleka = iloscMleka;
        this.nazwa = nazwa;

    }
    public int temp() {
        return 100;
    }
    public String gotowanieZSola(boolean gotowanieZSola) {
        if (gotowanieZSola) {
            return "Gotowanie z solą";
        } else {
            return "Gotowanie bez soli";
        }
    }






}
