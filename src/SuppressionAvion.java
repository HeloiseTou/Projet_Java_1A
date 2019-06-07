import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class SuppressionAvion extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] avions;
    private JTable container;

    SuppressionAvion() {
        enTete = new String[]{"Nombre d'heures de vol", "État", "Modèle", "Marque", "Prix de la location par jour", "Nombre de moteurs", "Vitesse maximale"};
        avions= listeAvion();
        container = new JTable(avions, enTete);
        setTitle("Suppression d'un avion");
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
        for (int i=0; i<Stockage.listeDesAvions.size(); i++){
            if (Stockage.listeDesAvions.get(i).getId()==Stockage.listeDesAvions.get(container.getSelectedRow()).getId()){
                Stockage.listeDesAvions.remove(Stockage.listeDesAvions.get(i));
            }
         }
        JOptionPane.showMessageDialog(rootPane, "Avion supprimé !");
        this.setVisible(false);
        this.dispose();
    }


    private String[][] listeAvion(){
        String[][] liste = new String[Stockage.listeDesAvions.size()][7];
        String et;
        for (int i = 0; i < Stockage.listeDesAvions.size(); i++) {
            if (Stockage.listeDesAvions.get(i).getEtat()){
                et = "Loué";
            }else {
                et = "Libre";
            }
            liste[i]= new String[]{String.valueOf(Stockage.listeDesAvions.get(i).getNbHeureVol()), et, Stockage.listeDesAvions.get(i).getModele(), Stockage.listeDesAvions.get(i).getMarque(), String.valueOf(Stockage.listeDesAvions.get(i).getPrixLocationParJour()),  String.valueOf(Stockage.listeDesAvions.get(i).getNbMoteur()), String.valueOf(Stockage.listeDesAvions.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
