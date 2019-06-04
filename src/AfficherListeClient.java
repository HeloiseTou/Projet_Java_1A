import javax.swing.*;
import java.awt.*;
import java.lang.String;


public class AfficherListeClient extends JFrame {

    private String[] enTete;
    private String[][] clients;
    private JTable container;

    AfficherListeClient() {
        enTete = new String[]{"Nom", "Prénom", "Age", "Adresse", "Téléphone"};
        clients = listeClient();
        container = new JTable(clients, enTete);
        setTitle("Liste clients");
        setSize(700, 250);
        Dimension localisationFenetre = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) localisationFenetre.getWidth() / 2 - this.getWidth() / 2, (int) localisationFenetre.getHeight() / 2 - this.getHeight() / 2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        setVisible(true);
    }


    private String[][] listeClient() {
        String[][] liste;
        if (AjoutClient.listeDesClients == null) {
            liste = new String[0][0];
        } else {
            liste = new String[AjoutClient.listeDesClients.size()][5];
            for (int i = 0; i < AjoutClient.listeDesClients.size(); i++) {
                liste[i] = new String[]{AjoutClient.listeDesClients.get(i).getNom(), AjoutClient.listeDesClients.get(i).getPrenom(), String.valueOf(AjoutClient.listeDesClients.get(i).getAge()), AjoutClient.listeDesClients.get(i).getAdresse(), AjoutClient.listeDesClients.get(i).getNumeroTel()};
            }
        }
        return (liste);

    }
}
