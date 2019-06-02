import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutAvion extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'un avion
    private JLabel nbHeureVol;
    private JLabel etat;
    private JLabel modele;
    private JLabel marque;
    private JLabel prixLocParJour;
    private JLabel nbMoteur;
    private JLabel vitesseMax;
    private JTextField entreeNbHeureVol;
    private JTextField entreeEtat;
    private JTextField entreeModele;
    private JTextField entreeMarque;
    private JTextField entreePrix;
    private JTextField entreeNbMoteur;
    private JTextField entreeVitesse;
    private JButton annuler;
    private JButton confirmer;

    AjoutAvion() {
        nbHeureVol = new JLabel("Nombre d'heures de vol");
        etat = new JLabel("État de l'avion");
        modele = new JLabel("Modèle de l'avion");
        marque = new JLabel("Marque de l'avion");
        prixLocParJour = new JLabel("Prix de la location par jour");
        nbMoteur = new JLabel("Nombre de moteurs");
        vitesseMax = new JLabel("Vistesse maximale");
        entreeNbHeureVol = new JTextField("");
        entreeEtat = new JTextField("");
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
        getContentPane().add(etat);
        getContentPane().add(entreeEtat);
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
            if(entreeNbHeureVol.getText().equals("")||entreeMarque.getText().equals("") || entreeNbMoteur.getText().equals("") || entreePrix.getText().equals("") || entreeEtat.getText().equals("") || entreeModele.getText().equals("") || entreeVitesse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else {
                Enregistrement nouveau = new Enregistrement();
                nouveau.enregistrerAvion(Integer.valueOf(entreeNbHeureVol.getText()), entreeEtat.getText(), entreeModele.getText(), entreeMarque.getText(), Integer.valueOf(entreePrix.getText()), Integer.valueOf(entreeNbMoteur.getText()), Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Avion enregistré !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }
}
