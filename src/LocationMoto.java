import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;

public class LocationMoto extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] motos;
    private JTable container;
    public static Moto motoChoisie;

    LocationMoto() {
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
        Stockage.listeDesMotos.get(container.getSelectedRow()).setEtat(true);
        motoChoisie = Stockage.listeDesMotos.get(container.getSelectedRow());
        Client client = AjoutLocation.clientChoisi;
        AfficherFenetreLocation location = new AfficherFenetreLocation(client, motoChoisie);
        this.setVisible(false);
        this.dispose();

    }


    private String[][] listeMoto(){
        String[][] liste = new String[Stockage.listeDesMotos.size()][7];
        String et;
        for (int i = 0; i < Stockage.listeDesMotos.size(); i++) {
            if (Stockage.listeDesMotos.get(i).getEtat()){
                et = "Loué";
            }else {
                et = "Libre";
            }
            liste[i]= new String[]{String.valueOf(Stockage.listeDesMotos.get(i).getKm()), et, Stockage.listeDesMotos.get(i).getModele(), Stockage.listeDesMotos.get(i).getMarque(), String.valueOf(Stockage.listeDesMotos.get(i).getPrixLocationParJour()),  String.valueOf(Stockage.listeDesMotos.get(i).getPuissance()), String.valueOf(Stockage.listeDesMotos.get(i).getVitesseMax())};
        }
        return (liste);
    }
}
