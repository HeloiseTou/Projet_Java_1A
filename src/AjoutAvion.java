import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class AjoutAvion extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'un avion
    private JLabel nbHeureVol;
    private JLabel modele;
    private JLabel marque;
    private JLabel prixLocParJour;
    private JLabel nbMoteur;
    private JLabel vitesseMax;
    private JTextField entreeNbHeureVol;
    private JTextField entreeModele;
    private JTextField entreeMarque;
    private JTextField entreePrix;
    private JTextField entreeNbMoteur;
    private JTextField entreeVitesse;
    private JButton annuler;
    private JButton confirmer;

    AjoutAvion() {
        nbHeureVol = new JLabel("Nombre d'heures de vol");
        modele = new JLabel("Modèle de l'avion");
        marque = new JLabel("Marque de l'avion");
        prixLocParJour = new JLabel("Prix de la location par jour");
        nbMoteur = new JLabel("Nombre de moteurs");
        vitesseMax = new JLabel("Vistesse maximale");
        entreeNbHeureVol = new JTextField("");
        entreeModele = new JTextField("");
        entreeMarque = new JTextField("");
        entreePrix = new JTextField("");
        entreeNbMoteur = new JTextField("");
        entreeVitesse = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        setTitle("Ajout avion");
        setLayout(new GridLayout(8, 2));
        setSize(800, 400);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        getContentPane().add(nbHeureVol);
        getContentPane().add(entreeNbHeureVol);
        getContentPane().add(modele);
        getContentPane().add(entreeModele);
        getContentPane().add(marque);
        getContentPane().add(entreeMarque);
        getContentPane().add(prixLocParJour);
        getContentPane().add(entreePrix);
        getContentPane().add(nbMoteur);
        getContentPane().add(entreeNbMoteur);
        getContentPane().add(vitesseMax);
        getContentPane().add(entreeVitesse);
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
            if(entreeNbHeureVol.getText().equals("")||entreeMarque.getText().equals("") || entreeNbMoteur.getText().equals("") || entreePrix.getText().equals("") || entreeModele.getText().equals("") || entreeVitesse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else {
                Stockage.numeroVehicule ++;
                enregistrerAvion(Stockage.numeroVehicule,Integer.valueOf(entreeNbHeureVol.getText()), false, entreeModele.getText(), entreeMarque.getText(), Integer.valueOf(entreePrix.getText()), Integer.valueOf(entreeNbMoteur.getText()), Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Avion enregistré !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }


    /**
     * Enregistre la location dans la liste des locations
     * @param  id : l'identifiant du véhicule
     * @param nbHeureVol : le nombre d'heures de vol du véhicule
     * @param etat : l'état du véhicule (s'il est libre ou loué)
     * @param modele : le modèle du véhicule     *
     * @param  marque :la marque du véhicule
     * @param prixLocationParJour : le prix de la location du véhicule par jour
     * @param nbMoteur : le nombre de moteurs du véhicule
     * @param vitesseMax : la vitesse maximale du véhicule
     */

    public void enregistrerAvion(int id, int nbHeureVol,boolean etat, String modele,String marque,int prixLocationParJour, int nbMoteur,int vitesseMax) {////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Avion av = new Avion();
        setVehicule(id, marque, modele, prixLocationParJour, vitesseMax, etat, av);
        av.setNbHeureVol(nbHeureVol);
        av.setNbMoteur(nbMoteur);
        Stockage.listeDesAvions.add(av);
        try {
            XMLTools.encodeToFile(Stockage.listeDesAvions, "avions.xml"); // sérialisation de la liste des clients
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Met à jour les paramètres du nouveau véhicule
     * @param  id : l'identifiant du véhicule
     * @param  marque :la marque du véhicule
     * @param modele : le modèle du véhicule
     * @param prixLocationParJour : le prix de la location du véhicule par jour
     * @param vitesseMax : la vitesse maximale du véhicule
     * @param etat : l'état du véhicule (s'il est libre ou loué)
     * @param vehicule : le véhicule loué
     */

    public void setVehicule(int id, String marque, String modele, int prixLocationParJour, int vitesseMax, boolean etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
        vehicule.setId(id);
    }
}
