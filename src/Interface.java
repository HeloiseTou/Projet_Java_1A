import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener{

    //Déclaration des éléments à mettre dans la fenêtre
    private JButton boutonNouveauClient;
    private JButton boutonNouveauVehicule;
    private JButton boutonSuppressionVehicule;
    private JButton boutonNouvelleLocation;
    private JButton boutonRestitutionVehicule;
    private JComboBox  listeVehicule;

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

    public Interface(){
        //Création de la fenêtre
        setTitle("Interface Loueur");
        setLayout(new GridLayout(3,2)); //Création d'une grille de 3 lignes et 2 colonnes
        setButtons();
        setJComboBox();
        setFenetre();
        setActions();
        setSize(700,300);

        //Pour rendre la fenêtre visible et la fermer à la fin
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setButtons(){
        boutonNouveauClient= new JButton ("Nouveau Client");
        boutonNouveauVehicule= new JButton ("Nouveau Véhicule");
        boutonSuppressionVehicule = new JButton ("Supprimer Véhicule");
        boutonNouvelleLocation = new JButton ("Nouvelle Location");
        boutonRestitutionVehicule = new JButton ("Resitution Véhicule");
    }

    private void setJComboBox(){
        String[] typeVehicule = {"Avions","Motos","Voitures"};
        listeVehicule = new JComboBox(typeVehicule);
    }



    private void setFenetre(){
        getContentPane().add(boutonNouveauClient);
        getContentPane().add(boutonNouveauVehicule);
        getContentPane().add(boutonNouvelleLocation);
        getContentPane().add(boutonSuppressionVehicule);
        getContentPane().add(boutonRestitutionVehicule);
        getContentPane().add(listeVehicule);
    }

    private void setActions(){
        boutonNouveauClient.addActionListener(this);
        boutonNouveauVehicule.addActionListener(this);
        boutonNouvelleLocation.addActionListener(this);
        boutonRestitutionVehicule.addActionListener(this);
        boutonSuppressionVehicule.addActionListener(this);
    }


    private void ajoutClient(){
        JFrame client = new JFrame();
        JLabel nomClient = new JLabel("Nom du client");
        JLabel prenomClient = new JLabel("Prénom du client");
        JLabel ageClient = new JLabel("Âge du client");
        JLabel adresseClient = new JLabel("Adresse du client");
        JLabel numTelClient = new JLabel("Numéro de téléphone du client");
        JTextField entreeNom = new JTextField("");
        JTextField entreePrenom = new JTextField("");
        JTextField entreeAge = new JTextField("");
        JTextField entreeAdresse = new JTextField("");
        JTextField entreeNumTel = new JTextField("");
        JButton annuler = new JButton("Annuler");
        JButton confirmer = new JButton("Confirmer");
        client.setTitle ("Ajout client");
        client.setLayout(new GridLayout(7,2));
        client.setSize(700,250);
        client.getContentPane().add(nomClient);
        client.getContentPane().add(entreeNom);
        client.getContentPane().add(prenomClient);
        client.getContentPane().add(entreePrenom);
        client.getContentPane().add(ageClient);
        client.getContentPane().add(entreeAge);
        client.getContentPane().add(adresseClient);
        client.getContentPane().add(entreeAdresse);
        client.getContentPane().add(numTelClient);
        client.getContentPane().add(entreeNumTel);
        client.getContentPane().add(annuler);
        client.getContentPane().add(confirmer);

        //Pour rendre la fenêtre visible et la fermer à la fin
        client.setVisible(true);
    }

    private void ajoutVehicule(){
        JOptionPane.showMessageDialog(rootPane, "Vous avez appuyé sur le bouton nouveau véhicule");
    }

    private void ajoutLocation(){
        JOptionPane.showMessageDialog(rootPane, "Vous avez appuyé sur le bouton nouvelle location");
    }

    private void suppressionVehicule(){
        JOptionPane.showMessageDialog(rootPane, "Vous voulez supprimer un véhicule");
    }

    private void restitutionVehicule(){
        JOptionPane.showMessageDialog(rootPane, "Vous voulez restituer un véhicule");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boutonNouveauClient){
            ajoutClient();
        }else if (e.getSource() == boutonNouveauVehicule) {
            ajoutVehicule();
        }else if (e.getSource() == boutonNouvelleLocation) {
            ajoutLocation();
        }else if (e.getSource() == boutonSuppressionVehicule){
            suppressionVehicule();
        }else if (e.getSource() == boutonRestitutionVehicule){
            restitutionVehicule();
        }
    }



    public static void main (String args[]){
        Interface loueur = new Interface();
    }

}
