import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;
import java.text.Format;
import java.text.SimpleDateFormat;

public class RestitutionVehicule extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] locations;
    private JTable container;
    public static Vehicule vehiculeChoisi;
    private Format formatter = new SimpleDateFormat("dd/MM/yyyy");


    RestitutionVehicule() {
        enTete = new String[]{"Nom du client", "Prénom du client","Marque du véhicule", "Modèle du véhicule", "Date de début", "Date de fin", "Nombre de km prévisionnel", "Prix prévisionnel"};
        locations= listeLocation();
        container = new JTable(locations, enTete);
        setTitle("Restitution d'un véhicule");
        setSize(1200, 250);
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
        Stockage.listeDesLocations.get(container.getSelectedRow()).getVehicule().setEtat(false);
        vehiculeChoisi = Stockage.listeDesLocations.get(container.getSelectedRow()).getVehicule();
        AfficherFenetreRestitution restitution = new AfficherFenetreRestitution(vehiculeChoisi, "moto");
        this.setVisible(false);
        this.dispose();

    }



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
