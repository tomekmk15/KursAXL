import javax.swing.*;
import java.time.LocalTime;

public class Rozmowa {
    public static void main(String[] args) {
        System.out.println("Teraz jest godzina" + LocalTime.now());

        // uruchom biezacy plik Ctrl+Shift+F10
        var imie = JOptionPane.showInputDialog("jak masz na imie?");
        JOptionPane.showMessageDialog(null, "witaj"  + imie);
    }

}
