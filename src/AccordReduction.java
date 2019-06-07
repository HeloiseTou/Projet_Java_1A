import javax .swing.JFrame;
import javax .swing.JOptionPane;


public class AccordReduction extends JFrame {

    public static int reduc;

    public AccordReduction() {
        String[] valeurs = {"Oui", "Non"};
        reduc = JOptionPane.showOptionDialog(AccordReduction.this,
                " Voulez-vous vaccorder une réduction au client ?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, valeurs, "Oui");
    }
}