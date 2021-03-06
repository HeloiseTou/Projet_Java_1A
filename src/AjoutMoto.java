import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class AjoutMoto extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'une moto
    private JLabel km;
    private JLabel modele;
    private JLabel marque;
    private JLabel prixLocParJour;
    private JLabel puissance;
    private JLabel vitesseMax;
    private JTextField entreeKm;
    private JTextField entreeModele;
    private JTextField entreeMarque;
    private JTextField entreePrix;
    private JTextField entreePuissance;
    private JTextField entreeVitesse;
    private JButton annuler;
    private JButton confirmer;

    AjoutMoto() {
        km = new JLabel("Nombre de km");
        modele = new JLabel("Modèle de la moto");
        marque = new JLabel("Marque de la moto");
        prixLocParJour = new JLabel("Prix de la location par jour");
        puissance = new JLabel("Puissance");
        vitesseMax = new JLabel("Vistesse maximale");
        entreeKm = new JTextField("");
        entreeModele = new JTextField("");
        entreeMarque = new JTextField("");
        entreePrix = new JTextField("");
        entreePuissance = new JTextField("");
        entreeVitesse = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        setTitle("Ajout moto");
        setLayout(new GridLayout(8, 2));
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
            if(entreeKm.getText().equals("")||entreeMarque.getText().equals("") || entreePuissance.getText().equals("") || entreePrix.getText().equals("") ||  entreeModele.getText().equals("") || entreeVitesse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else{
                Stockage.numeroVehicule ++;
                enregistrerMoto(Stockage.numeroVehicule, Integer.valueOf(entreeKm.getText()), entreeMarque.getText(), Integer.valueOf(entreePuissance.getText()), Integer.valueOf(entreePrix.getText()), false, entreeModele.getText(), Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Moto enregistrée !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }


    public void enregistrerMoto(int id, int km, String marque, int puissance,int prixLocationParJour, boolean etat,  String modele, int vitesseMax){
        Moto moto = new Moto();
        setVehicule(id, marque, modele, prixLocationParJour, vitesseMax, etat, moto);
        moto.setKm(km);
        moto.setPuissance(puissance);
        Stockage.listeDesMotos.add(moto);
        try {
            XMLTools.encodeToFile(Stockage.listeDesMotos, "motos.xml"); // sérialisation de la liste des motos
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
