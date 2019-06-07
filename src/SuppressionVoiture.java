import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class SuppressionVoiture extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] voitures;
    private JTable container;

    SuppressionVoiture() {
        enTete = new String[]{"Nombre de km", "État", "Modèle", "Marque", "Prix de la location par jour", "Puissance", "Vitesse maximale", "Nombre de places"};
        voitures= listeVoiture();
        container = new JTable(voitures, enTete);
        setTitle("Suppression d'une voiture");
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
        for (int i=0; i<Stockage.listeDesVoitures.size(); i++){
            if (Stockage.listeDesVoitures.get(i).getId()==Stockage.listeDesVoitures.get(container.getSelectedRow()).getId()){
                Stockage.listeDesVoitures.remove(Stockage.listeDesVoitures.get(i));
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Voiture supprimée !");
        this.setVisible(false);
        this.dispose();
    }


    private String[][] listeVoiture(){
        String[][] liste = new String[Stockage.listeDesVoitures.size()][8];
        String et;
        for (int i = 0; i < Stockage.listeDesVoitures.size(); i++) {
            if (Stockage.listeDesVoitures.get(i).getEtat()){
                et = "Loué";
            }else {
                et = "Libre";
            }
            liste[i]= new String[]{String.valueOf(Stockage.listeDesVoitures.get(i).getKm()), et, Stockage.listeDesVoitures.get(i).getModele(), Stockage.listeDesVoitures.get(i).getMarque(), String.valueOf(Stockage.listeDesVoitures.get(i).getPrixLocationParJour()),  String.valueOf(Stockage.listeDesVoitures.get(i).getPuissance()), String.valueOf(Stockage.listeDesVoitures.get(i).getVitesseMax()), String.valueOf(Stockage.listeDesVoitures.get(i).getNbPlace())};
        }
        return (liste);
    }


}
