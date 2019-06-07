import javax .swing.JFrame;
import javax .swing.JOptionPane;


public class Confirmation extends JFrame {

    public static int choix;

    public Confirmation() {
        String[] valeurs = {"Oui", "Non"};
        choix = JOptionPane.showOptionDialog(Confirmation.this,
                " Voulez-vous vraiment supprimer ce véhicule ?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valeurs, "Oui");
    }
}