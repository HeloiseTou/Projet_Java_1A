import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class AfficherListeVoiture extends JFrame {

    private String[] enTete;
    private String[][] voitures;
    private JTable container;

    AfficherListeVoiture() {
        enTete = new String[]{"Nombre de km", "État", "Modèle", "Marque", "Prix de la location par jour", "Puissance", "Vitesse maximale", "Nombre de places"};
        voitures= listeVoiture();
        container = new JTable(voitures, enTete);
        setTitle("Liste voitures");
        setSize(700, 250);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        setVisible(true);
    }





    private String[][] listeVoiture(){
        String[][] liste = new String[SerializeStockage.listeDesVoitures.size()][8];
        String et;
        for (int i = 0; i < SerializeStockage.listeDesVoitures.size(); i++) {
            if (SerializeStockage.listeDesVoitures.get(i).getEtat()){
                et = "Loué";
            }else{
                et = "Libre";
            }
            liste[i]= new String[]{String.valueOf(SerializeStockage.listeDesVoitures.get(i).getKm()), et, SerializeStockage.listeDesVoitures.get(i).getModele(), SerializeStockage.listeDesVoitures.get(i).getMarque(), String.valueOf(SerializeStockage.listeDesVoitures.get(i).getPrixLocationParJour()),  String.valueOf(SerializeStockage.listeDesVoitures.get(i).getPuissance()), String.valueOf(SerializeStockage.listeDesVoitures.get(i).getVitesseMax()), String.valueOf(SerializeStockage.listeDesVoitures.get(i).getNbPlace())};
        }
        return (liste);
    }


}
