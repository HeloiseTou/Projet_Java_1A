import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class AfficherListeVoiture extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] voitures;
    private JTable container;
    public static Voiture voitureChoisie;

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
        container.getSelectionModel().addListSelectionListener(this);
        setVisible(true);
    }



    public void valueChanged(ListSelectionEvent event) {
        voitureChoisie = Enregistrement.listeEnregistrementVoiture.get(container.getSelectedRow());
    }


    private String[][] listeVoiture(){
        String[][] liste = new String[Enregistrement.listeEnregistrementVoiture.size()][8];
        for (int i = 0; i < Enregistrement.listeEnregistrementVoiture.size(); i++) {
            liste[i]= new String[]{String.valueOf(Enregistrement.listeEnregistrementVoiture.get(i).getKm()), Enregistrement.listeEnregistrementVoiture.get(i).getEtat(), Enregistrement.listeEnregistrementVoiture.get(i).getModele(), Enregistrement.listeEnregistrementVoiture.get(i).getMarque(), String.valueOf(Enregistrement.listeEnregistrementVoiture.get(i).getPrixLocationParJour()),  String.valueOf(Enregistrement.listeEnregistrementVoiture.get(i).getPuissance()), String.valueOf(Enregistrement.listeEnregistrementVoiture.get(i).getVitesseMax()), String.valueOf(Enregistrement.listeEnregistrementVoiture.get(i).getNbPlace())};
        }
        return (liste);
    }
}
