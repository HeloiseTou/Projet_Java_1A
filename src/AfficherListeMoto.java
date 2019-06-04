import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class AfficherListeMoto extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] motos;
    private JTable container;
    public static Moto motoChoisie;

    AfficherListeMoto() {
        enTete = new String[]{"Nombre de km", "État", "Modèle", "Marque", "Prix de la location par jour", "Puissance", "Vitesse maximale"};
        motos= listeMoto();
        container = new JTable(motos, enTete);
        setTitle("Liste motos");
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
        motoChoisie = AjoutMoto.listeDesMotos.get(container.getSelectedRow());
    }


    private String[][] listeMoto(){
        String[][] liste = new String[AjoutMoto.listeDesMotos.size()][7];
        for (int i = 0; i < AjoutMoto.listeDesMotos.size(); i++) {
            liste[i]= new String[]{String.valueOf(AjoutMoto.listeDesMotos.get(i).getKm()), AjoutMoto.listeDesMotos.get(i).getEtat(), AjoutMoto.listeDesMotos.get(i).getModele(), AjoutMoto.listeDesMotos.get(i).getMarque(), String.valueOf(AjoutMoto.listeDesMotos.get(i).getPrixLocationParJour()),  String.valueOf(AjoutMoto.listeDesMotos.get(i).getPuissance()), String.valueOf(AjoutMoto.listeDesMotos.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
