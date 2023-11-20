package Switch;

import javax.swing.*;

public class IleDniMaMiesiacProba {
    public static void main(String[] args) {
        String miesiac = JOptionPane.showInputDialog("Enter the name of the month");

        switch (miesiac.toLowerCase()){
            case "styczen" :
            case "marzec":
            case "maj":
            case "lipiec":
            case "sierpien":
            case "pazdziernik":
            case "grudzien":
                JOptionPane.showMessageDialog(null, "These months have 31 days");
                break;
            case "kwiecien":
            case "czerwiec":
            case "wrzesien":
            case "listopad":
                JOptionPane.showMessageDialog(null, "These months have 31 days");
                break;
            case "luty":
                JOptionPane.showMessageDialog(null, "February has 28 or 29 days");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorrect month name");
                break;
        }
    }
}


