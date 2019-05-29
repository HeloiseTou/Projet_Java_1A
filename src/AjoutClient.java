import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutClient extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'un client
    private JLabel nomClient;
    private JLabel prenomClient;
    private JLabel ageClient;
    private JLabel adresseClient;
    private JLabel numTelClient;
    private JTextField entreeNom;
    private JTextField entreePrenom;
    private JTextField entreeAge;
    private JTextField entreeAdresse;
    private JTextField entreeNumTel;
    private JButton annuler;
    private JButton confirmer;

    AjoutClient() {
        nomClient = new JLabel("Nom du client");
        prenomClient = new JLabel("Prénom du client");
        ageClient = new JLabel("Âge du client");
        adresseClient = new JLabel("Adresse du client");
        numTelClient = new JLabel("Numéro de téléphone du client");
        entreeNom = new JTextField("");
        entreePrenom = new JTextField("");
        entreeAge = new JTextField("");
        entreeAdresse = new JTextField("");
        entreeNumTel = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        setTitle("Ajout client");
        setLayout(new GridLayout(7, 2));
        setSize(700, 250);
        getContentPane().add(nomClient);
        getContentPane().add(entreeNom);
        getContentPane().add(prenomClient);
        getContentPane().add(entreePrenom);
        getContentPane().add(ageClient);
        getContentPane().add(entreeAge);
        getContentPane().add(adresseClient);
        getContentPane().add(entreeAdresse);
        getContentPane().add(numTelClient);
        getContentPane().add(entreeNumTel);
        getContentPane().add(annuler);
        getContentPane().add(confirmer);
        confirmer.addActionListener(this);
        annuler.addActionListener(this);


        //Pour rendre la fenêtre visible et la fermer à la fin
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== annuler){
            System.out.println("bonjour");
            this.setVisible(false);
            this.dispose();
        }
    }
}
