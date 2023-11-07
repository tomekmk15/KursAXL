import javax.swing.JOptionPane;

public class RobimyZakupy {
    public static void main(String[] args) {
        // Pytamy o cenę za kilo ziemniaków
        String cenaZiemniakowStr = JOptionPane.showInputDialog("Podaj cenę za kilogram ziemniaków:");
        double cenaZiemniakow = Double.parseDouble(cenaZiemniakowStr);

        // Obliczamy koszt za 5 kilogramów ziemniaków
        double kosztZiemniakow = cenaZiemniakow * 5;

        // Wyynik
        JOptionPane.showMessageDialog(null, "Koszt 5 kilogramów ziemniaków wynosi: " + kosztZiemniakow);
        //
        // Pytamy  o cenę za kilo ziemniakow
        String cennaziemniStr = JOptionPane.showInputDialog("Podaj cenę za kilogram ziemniakow:");
        double cenaziemniStr = Double.parseDouble(cennaziemniStr);

        // Pytamy  o ilość kilogramów ziemiakow do zakupu
        String ilosciZiemniakowStr = JOptionPane.showInputDialog("Ile kilogramów ziemniakow chcesz kupić:");
        double iloscZiemniakowStr = Double.parseDouble(ilosciZiemniakowStr);


        //
        // Pytamy użytkownika o cenę za kilo bananów
        String cenaBananowStr = JOptionPane.showInputDialog("Podaj cenę za kilogram bananów:");
        double cenaBananow = Double.parseDouble(cenaBananowStr);

        // Pytamy użytkownika o ilość kilogramów bananów do zakupu
        String iloscBananowStr = JOptionPane.showInputDialog("Ile kilogramów bananów chcesz kupić:");
        double iloscBananow = Double.parseDouble(iloscBananowStr);



        // Obliczamy koszt za banany
        double kosztBananow = cenaBananow * iloscBananow;

        // Obliczamy łączny koszt zakupów
        double lacznyKoszt = kosztZiemniakow + kosztBananow;

        // Wyświetlamy wynik
        JOptionPane.showMessageDialog(null, "Koszt ziemniaków wynosi: " + kosztZiemniakow);
        JOptionPane.showMessageDialog(null, "Koszt bananów wynosi: " + kosztBananow);

        // Sprawdzamy, za co trzeba zapłacić więcej
        if (kosztZiemniakow > kosztBananow) {
            JOptionPane.showMessageDialog(null, "Za ziemniaki trzeba zapłacić więcej.");
        } else if (kosztBananow > kosztZiemniakow) {
            JOptionPane.showMessageDialog(null, "Za banany trzeba zapłacić więcej.");
        } else {
            JOptionPane.showMessageDialog(null, "Koszty za ziemniaki i banany są takie same.");
        }
    }
}
