import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class AjoutVoiture extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'une moto
    private JLabel km;
    private JLabel etat;
    private JLabel modele;
    private JLabel marque;
    private JLabel prixLocParJour;
    private JLabel puissance;
    private JLabel vitesseMax;
    private JLabel nbPlace;
    private JTextField entreeKm;
    private JTextField entreeEtat;
    private JTextField entreeModele;
    private JTextField entreeMarque;
    private JTextField entreePrix;
    private JTextField entreePuissance;
    private JTextField entreeVitesse;
    private JTextField entreeNbPlace;
    private JButton annuler;
    private JButton confirmer;

    AjoutVoiture() {
        km = new JLabel("Nombre de km");
        etat = new JLabel("État de la voiture");
        modele = new JLabel("Modèle de la voiture");
        marque = new JLabel("Marque de la voiture");
        prixLocParJour = new JLabel("Prix de la location par jour");
        puissance = new JLabel("Puissance");
        vitesseMax = new JLabel("Vistesse maximale");
        nbPlace = new JLabel("Nombre de places");
        entreeKm = new JTextField("");
        entreeModele = new JTextField("");
        entreeMarque = new JTextField("");
        entreePrix = new JTextField("");
        entreePuissance = new JTextField("");
        entreeVitesse = new JTextField("");
        entreeNbPlace = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        setTitle("Ajout voiture");
        setLayout(new GridLayout(9, 2));
        setSize(800, 400);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        getContentPane().add(km);
        getContentPane().add(entreeKm);
        getContentPane().add(modele);
        getContentPane().add(entreeModele);
        getContentPane().add(marque);
        getContentPane().add(entreeMarque);
        getContentPane().add(prixLocParJour);
        getContentPane().add(entreePrix);
        getContentPane().add(puissance);
        getContentPane().add(entreePuissance);
        getContentPane().add(vitesseMax);
        getContentPane().add(entreeVitesse);
        getContentPane().add(nbPlace);
        getContentPane().add(entreeNbPlace);
        getContentPane().add(annuler);
        getContentPane().add(confirmer);
        confirmer.addActionListener(this);
        annuler.addActionListener(this);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== annuler){
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==confirmer){
            if(entreeKm.getText().equals("")|| entreeNbPlace.getText().equals("") || entreeMarque.getText().equals("") || entreePuissance.getText().equals("") || entreePrix.getText().equals("") ||entreeModele.getText().equals("") || entreeVitesse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else {
                Stockage.numeroVehicule ++;
                enregistrerVoiture(Stockage.numeroVehicule,Integer.valueOf(entreeKm.getText()), Integer.valueOf(entreeNbPlace.getText()), entreeMarque.getText(), entreeModele.getText(), Integer.valueOf(entreePuissance.getText()), Integer.valueOf(entreePrix.getText()), false, Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Voiture enregistrée !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }

    public void enregistrerVoiture(int id,int km, int nbPlace, String marque, String modele, int puissance,int prixLocationParJour, boolean etat, int vitesseMax){
        Voiture voitu = new Voiture();
        setVehicule(id, marque, modele, prixLocationParJour, vitesseMax, etat, voitu);
        voitu.setKm(km);
        voitu.setNbPlace(nbPlace);
        voitu.setPuissance(puissance);
        Stockage.listeDesVoitures.add(voitu);
        try {
            XMLTools.encodeToFile(Stockage.listeDesVoitures, "voitures.xml"); // sérialisation de la liste des voitures
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setVehicule(int id, String marque, String modele, int prixLocationParJour, int vitesseMax, boolean etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
        vehicule.setId(id);
    }
}
