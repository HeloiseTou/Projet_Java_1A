import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutMoto extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'une moto
    private JLabel km;
    private JLabel etat;
    private JLabel modele;
    private JLabel marque;
    private JLabel prixLocParJour;
    private JLabel puissance;
    private JLabel vitesseMax;
    private JTextField entreeKm;
    private JTextField entreeEtat;
    private JTextField entreeModele;
    private JTextField entreeMarque;
    private JTextField entreePrix;
    private JTextField entreePuissance;
    private JTextField entreeVitesse;
    private JButton annuler;
    private JButton confirmer;

    AjoutMoto() {
        km = new JLabel("Nombre de km");
        etat = new JLabel("État de la moto");
        modele = new JLabel("Modèle de la moto");
        marque = new JLabel("Marque de la moto");
        prixLocParJour = new JLabel("Prix de la location par jour");
        puissance = new JLabel("Puissance");
        vitesseMax = new JLabel("Vistesse maximale");
        entreeKm = new JTextField("");
        entreeEtat = new JTextField("");
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
        getContentPane().add(etat);
        getContentPane().add(entreeEtat);
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


        //Pour rendre la fenêtre visible et la fermer à la fin
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== annuler){
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==confirmer){
            if(entreeKm.getText().equals("")||entreeMarque.getText().equals("") || entreePuissance.getText().equals("") || entreePrix.getText().equals("") || entreeEtat.getText().equals("") || entreeModele.getText().equals("") || entreeVitesse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else{
                Enregistrement nouveau = new Enregistrement();
                nouveau.enregistrerMoto(Integer.valueOf(entreeKm.getText()), entreeMarque.getText(), Integer.valueOf(entreePuissance.getText()), Integer.valueOf(entreePrix.getText()), entreeEtat.getText(), entreeModele.getText(), Integer.valueOf(entreeVitesse.getText()));
                JOptionPane.showMessageDialog(rootPane, "Moto enregistrée !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }
}
