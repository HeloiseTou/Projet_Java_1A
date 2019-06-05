import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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


        //Pour rendre la fenêtre visible et la fermer à la fin
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
                enregistrerAvion(Integer.valueOf(entreeNbHeureVol.getText()), false, entreeModele.getText(), entreeMarque.getText(), Integer.valueOf(entreePrix.getText()), Integer.valueOf(entreeNbMoteur.getText()), Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Avion enregistré !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }


    public void enregistrerAvion(int nbHeureVol,boolean etat, String modele,String marque,int prixLocationParJour, int nbMoteur,int vitesseMax) {////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Avion av = new Avion();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, av);
        av.setNbHeureVol(nbHeureVol);
        av.setNbMoteur(nbMoteur);
        SerializeStockage.listeDesAvions.add(av);
    }


    public void setVehicule(String marque, String modele, int prixLocationParJour, int vitesseMax, boolean etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
    }
}
