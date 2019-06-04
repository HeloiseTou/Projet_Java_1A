import javax.swing.*;
import java.awt.*;
import java.lang.String;

public class AfficherListeMoto extends JFrame  {

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
        setVisible(true);
    }



    private String[][] listeMoto(){
        String[][] liste = new String[AjoutMoto.listeDesMotos.size()][7];
        for (int i = 0; i < AjoutMoto.listeDesMotos.size(); i++) {
            liste[i]= new String[]{String.valueOf(AjoutMoto.listeDesMotos.get(i).getKm()), AjoutMoto.listeDesMotos.get(i).getEtat(), AjoutMoto.listeDesMotos.get(i).getModele(), AjoutMoto.listeDesMotos.get(i).getMarque(), String.valueOf(AjoutMoto.listeDesMotos.get(i).getPrixLocationParJour()),  String.valueOf(AjoutMoto.listeDesMotos.get(i).getPuissance()), String.valueOf(AjoutMoto.listeDesMotos.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
