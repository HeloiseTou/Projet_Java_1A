import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class AjoutClient extends JFrame implements ActionListener {

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
        Dimension localisationFenetre = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) localisationFenetre.getWidth() / 2 - this.getWidth() / 2, (int) localisationFenetre.getHeight() / 2 - this.getHeight() / 2);
        setResizable(false);
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
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == annuler) {
            this.setVisible(false);
            this.dispose();
        } else if (e.getSource() == confirmer) {
            if (entreeNom.getText().equals("") || entreePrenom.getText().equals("") || entreeAdresse.getText().equals("") || entreeAge.getText().equals("") || entreeNumTel.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            } else {
                enregistrerClient(entreeNom.getText(), entreePrenom.getText(), Integer.valueOf(entreeAge.getText()), entreeAdresse.getText(), entreeNumTel.getText());
                JOptionPane.showMessageDialog(rootPane, "Client enregistré !");
                this.setVisible(false);
                this.dispose();
            }
        }
    }


    public void enregistrerClient(String nom, String prenom, int age, String adresse, String numeroTel) {
        Client nouveauClient = new Client(nom, prenom, age, adresse, numeroTel);
        Stockage.listeDesClients.add(nouveauClient);
        try {
            XMLTools.encodeToFile(Stockage.listeDesClients, "clients.xml"); // sérialisation de la liste des clients
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}