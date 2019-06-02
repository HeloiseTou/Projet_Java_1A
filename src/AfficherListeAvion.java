import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class AfficherListeAvion extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] avions;
    private JTable container;
    public static Avion avionChoisi;

    AfficherListeAvion() {
        enTete = new String[]{"Nombre d'heures de vol", "État", "Modèle", "Marque", "Prix de la location par jour", "Nombre de moteurs", "Vitesse maximale"};
        avions= listeAvion();
        container = new JTable(avions, enTete);
        setTitle("Liste avions");
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
        avionChoisi = Enregistrement.listeEnregistrementAvion.get(container.getSelectedRow());
    }


    private String[][] listeAvion(){
        String[][] liste = new String[Enregistrement.listeEnregistrementAvion.size()][7];
        for (int i = 0; i < Enregistrement.listeEnregistrementAvion.size(); i++) {
            liste[i]= new String[]{String.valueOf(Enregistrement.listeEnregistrementAvion.get(i).getNbHeureVol()), Enregistrement.listeEnregistrementAvion.get(i).getEtat(), Enregistrement.listeEnregistrementAvion.get(i).getModele(), Enregistrement.listeEnregistrementAvion.get(i).getMarque(), String.valueOf(Enregistrement.listeEnregistrementAvion.get(i).getPrixLocationParJour()),  String.valueOf(Enregistrement.listeEnregistrementAvion.get(i).getNbMoteur()), String.valueOf(Enregistrement.listeEnregistrementAvion.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
