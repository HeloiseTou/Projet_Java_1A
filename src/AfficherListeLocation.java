import javax.swing.*;
import java.awt.*;
import java.lang.String;
import java.text.Format;
import java.text.SimpleDateFormat;


public class AfficherListeLocation extends JFrame {

    private String[] enTete;
    private String[][] locations;
    private JTable container;
    private Format formatter = new SimpleDateFormat("dd/MM/yyyy");

    AfficherListeLocation() {
        enTete = new String[]{"Nom du client", "Prénom du client","Marque du véhicule", "Modèle du véhicule", "Date de début", "Date de fin", "Nombre de km prévisionnel", "Prix prévisionnel"};
        locations = listeLocation();
        container = new JTable(locations, enTete);
        setTitle("Liste des locations");
        setSize(1000, 250);
        Dimension localisationFenetre = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) localisationFenetre.getWidth() / 2 - this.getWidth() / 2, (int) localisationFenetre.getHeight() / 2 - this.getHeight() / 2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        setVisible(true);
    }



    /**
     * Renvoie la liste des locations
     * @return la liste des locations
     */

    private String[][] listeLocation() {
        String[][] liste;
        if (Stockage.listeDesLocations == null) {
            liste = new String[0][0];
        } else {
            liste = new String[Stockage.listeDesLocations.size()][8];
            for (int i = 0; i < Stockage.listeDesLocations.size(); i++) {
                liste[i] = new String[]{Stockage.listeDesLocations.get(i).getClient().getNom(), Stockage.listeDesLocations.get(i).getClient().getPrenom(), Stockage.listeDesLocations.get(i).getVehicule().getMarque(), Stockage.listeDesLocations.get(i).getVehicule().getModele(), formatter.format(Stockage.listeDesLocations.get(i).getDateDebut()), formatter.format(Stockage.listeDesLocations.get(i).getDateFin()), String.valueOf(Stockage.listeDesLocations.get(i).getNbKmPrevisionnel()), String.valueOf(Stockage.listeDesLocations.get(i).prixPrevisionnel())};
            }
        }
        return (liste);
    }
}
