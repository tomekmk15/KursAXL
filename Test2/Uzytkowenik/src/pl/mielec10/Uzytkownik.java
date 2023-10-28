package pl.mielec10;

public class Uzytkownik {
    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public boolean czyPelnoletni() {
        if (wiek >= 18) {
            return true;
        } else {
            return false;
        }

    }
}





