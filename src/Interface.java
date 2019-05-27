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


    Interface(){
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


    public void actionPerformed(ActionEvent e){

    }



    public static void main (String args []){
        Interface loueur = new Interface();
    }

}
