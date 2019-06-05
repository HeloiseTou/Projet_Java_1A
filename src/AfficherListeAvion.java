import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class AfficherListeAvion extends JFrame  {

    private String[] enTete;
    private String[][] avions;
    private JTable container;

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
        String[][] liste = new String[SerializeStockage.listeDesAvions.size()][7];
        String et;
        for (int i = 0; i < SerializeStockage.listeDesAvions.size(); i++) {
            if (SerializeStockage.listeDesAvions.get(i).getEtat()){
                et = "Loué";
            }else {
                et = "Libre";
            }
            liste[i]= new String[]{String.valueOf(SerializeStockage.listeDesAvions.get(i).getNbHeureVol()), et, SerializeStockage.listeDesAvions.get(i).getModele(), SerializeStockage.listeDesAvions.get(i).getMarque(), String.valueOf(SerializeStockage.listeDesAvions.get(i).getPrixLocationParJour()),  String.valueOf(SerializeStockage.listeDesAvions.get(i).getNbMoteur()), String.valueOf(SerializeStockage.listeDesAvions.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
