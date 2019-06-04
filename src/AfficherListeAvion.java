import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class AfficherListeAvion extends JFrame  {

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
        setVisible(true);
    }




    private String[][] listeAvion(){
        String[][] liste = new String[AjoutAvion.listeDesAvions.size()][7];
        for (int i = 0; i < AjoutAvion.listeDesAvions.size(); i++) {
            liste[i]= new String[]{String.valueOf(AjoutAvion.listeDesAvions.get(i).getNbHeureVol()), AjoutAvion.listeDesAvions.get(i).getEtat(), AjoutAvion.listeDesAvions.get(i).getModele(), AjoutAvion.listeDesAvions.get(i).getMarque(), String.valueOf(AjoutAvion.listeDesAvions.get(i).getPrixLocationParJour()),  String.valueOf(AjoutAvion.listeDesAvions.get(i).getNbMoteur()), String.valueOf(AjoutAvion.listeDesAvions.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
