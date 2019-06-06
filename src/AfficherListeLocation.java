import javax.swing.*;
import java.awt.*;
import java.lang.String;


public class AfficherListeLocation extends JFrame {

    private String[] enTete;
    private String[][] locations;
    private JTable container;

    AfficherListeLocation() {
        enTete = new String[]{"NomClient", "PrénomClient","Vehicule", "Date de début", "Date de fin", "Nombre de km prévisionnel", "Prix prévisionnel"};
        locations = listeLocation();
        container = new JTable(locations, enTete);
        setTitle("Liste des locations");
        setSize(700, 250);
        Dimension localisationFenetre = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) localisationFenetre.getWidth() / 2 - this.getWidth() / 2, (int) localisationFenetre.getHeight() / 2 - this.getHeight() / 2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        setVisible(true);
    }


    private String[][] listeLocation() {
        String[][] liste;
        if (SerializeStockage.listeDesLocations == null) {
            liste = new String[0][0];
        } else {
            liste = new String[SerializeStockage.listeDesLocations.size()][5];
            for (int i = 0; i < SerializeStockage.listeDesLocations.size(); i++) {
                liste[i] = new String[]{SerializeStockage.listeDesClients.get(i).getNom(), SerializeStockage.listeDesClients.get(i).getPrenom(), String.valueOf(SerializeStockage.listeDesClients.get(i).getAge()), SerializeStockage.listeDesClients.get(i).getAdresse(), SerializeStockage.listeDesClients.get(i).getNumeroTel()};
            }
        }
        return (liste);

    }
}