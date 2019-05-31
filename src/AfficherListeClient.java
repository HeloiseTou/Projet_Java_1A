import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class AfficherListeClient extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] clients;
    private JTable container;
    public static Client clientChoisi;
    public static int essai;

    AfficherListeClient() {
        enTete = new String[]{"Nom", "Prénom", "Age", "Adresse", "Téléphone"};
        clients= listeClient();
        container = new JTable(clients, enTete);
        setTitle("Liste client");
        setSize(700, 250);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        container.getSelectionModel().addListSelectionListener(this);
        setVisible(true);
    }



        public void valueChanged(ListSelectionEvent event) {
            // do some actions here, for example
            // print first column value from selected row
            System.out.println(container.getValueAt(container.getSelectedRow(), 0).toString());
            clientChoisi = new Client("Jean", "Pierre", 59, "2 rue des Poulpes", "0605040302");//container.getSelectedRow();
            essai = 12;
        }


    private String[][] listeClient(){
        String[][] liste = new String[3][5];
        liste[0]= new String[]{"Albert", "Just", "45", "2 rue des Chenes", "0342233221"};
        liste[1] =new String[]{"Donald", "Mc", "56", "5 rue des Chapelains", "0102010011"};
        liste[2] = new String[]{"Dupont", "Durant", "62", "2 rue de la Paix", "066666000"};
        return (liste);
    }
}
