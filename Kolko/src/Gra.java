public class Gra {

    private char[][] plansza;
    private Gracz aktualnyGracz;

    public Gra(char[][] plansza, Gracz aktualnyGracz) {
        this.plansza = plansza;
        this.aktualnyGracz = getAktualnyGracz();
    }

    public Gracz getAktualnyGracz() {

        return aktualnyGracz;
    }
    public boolean czyGraSkonczona() {
        return czyRemis() || czyWygrana();

    }
    public boolean czyRuchMozliwy(int wiersz, int kolumna) {
        return plansza[wiersz][kolumna] == ' ';
    }
    public void wykonajRuch(int wiersz, int kolumna) {
        plansza[wiersz][kolumna] = aktualnyGracz.getOznaczenie();

        Gracz gracz1 =aktualnyGracz;

        Gracz gracz2 = aktualnyGracz;
        aktualnyGracz = (aktualnyGracz == gracz1) ? gracz2 : gracz1;
    }
    public boolean czyRemis() {
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                if (plansza[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    boolean czyWygrana() {

        for (int i = 0; i< 3; i++) {

            if (plansza[i][0] == plansza[i][1] && plansza[i][1] == plansza[i][2] && plansza[i][0] != ' ')
                return true;

            if (plansza[0][i] == plansza[1][i] && plansza[1][i] == plansza[2][i] && plansza[0][i] != ' ') {
                return true;
            }
        }
        if (plansza[0][0] == plansza[1][1] && plansza[1][1] == plansza[2][2] && plansza[0][0] != ' ') {


            return true; // wygrana na przekątnej (od lewej do prawej)
        }
        if (plansza[0][2] == plansza[1][1] && plansza[1][1] == plansza[2][0] && plansza[0][2] != ' ') {
            return true; // wygrana na przekątnej (od prawej do lewej)
        }
        return false;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                result += plansza[i][j];
                if (j < plansza[i].length - 1) {
                    result += "|";
                }
            }
            if (i < plansza.length - 1) {
                result += "-+-+-\n";



            }
        }
        return result;
    }
}






// Path: src\Gracz.java