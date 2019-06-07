import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfficherFenetreRestitution extends JFrame implements ActionListener {
    private JLabel dateFin;
    private JLabel km;
    private JTextField entreeDateFin;
    private JTextField entreeKm;
    private JButton annuler;
    private JButton confirmer;
    private int prixPrevi;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Vehicule vehiculeChoisi ;
    private String typeVehicule;

    AfficherFenetreRestitution(Vehicule vehicule, String typeVehi) {
        typeVehicule = typeVehi;
        dateFin = new JLabel("Date de fin de la location");
        km = new JLabel("Nombre de km effectués");
        entreeDateFin = new JTextField("");
        entreeKm = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        vehiculeChoisi = vehicule;
        setTitle("Restitution d'un véhicule");
        setLayout(new GridLayout(8, 2));
        setSize(800, 400);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        getContentPane().add(dateFin);
        getContentPane().add(entreeDateFin);
        getContentPane().add(km);
        getContentPane().add(entreeKm);
        getContentPane().add(annuler);
        getContentPane().add(confirmer);
        confirmer.addActionListener(this);
        annuler.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== annuler){
            if (typeVehicule.equals("avion")) {
                for (int i=0; i<Stockage.listeDesAvions.size(); i++){
                    if (Stockage.listeDesAvions.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesAvions.get(i).setEtat(true);
                    }
                }
            }
            if (typeVehicule.equals("moto")) {
                for (int i=0; i<Stockage.listeDesMotos.size(); i++){
                    if (Stockage.listeDesMotos.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesMotos.get(i).setEtat(true);
                    }
                }
            }
            if (typeVehicule.equals("voiture")) {
                for (int i=0; i<Stockage.listeDesVoitures.size(); i++){
                    if (Stockage.listeDesVoitures.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesVoitures.get(i).setEtat(true);
                    }
                }
            }
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==confirmer){
            if(entreeDateFin.getText().equals("") ||  entreeKm.getText().equals("") ){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else {
                for (int i=0; i<Stockage.listeDesLocations.size(); i++){
                    if (Stockage.listeDesLocations.get(i).getVehicule().equals(vehiculeChoisi)){
                        try {
                            Date dateFi = formatter.parse(entreeDateFin.getText());
                            Stockage.listeDesLocations.get(i).setDateFin(dateFi);
                        } catch (ParseException eve) {
                             eve.printStackTrace();
                        }
                        prixPrevi = Stockage.listeDesLocations.get(i).prixPrevisionnel();
                        Stockage.listeDesLocations.remove(Stockage.listeDesLocations.get(i));
                    }
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Prix à payer = "+prixPrevi+" euros");
            JOptionPane.showMessageDialog(rootPane, "Véhicule restitué !");
            this.setVisible(false);
            this.dispose();
        }
    }
}
