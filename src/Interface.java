import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener{

    //Déclaration des éléments à mettre dans la fenêtre
    private JPanel panneau = new JPanel();
    private JButton boutonNouveauClient;
    private JButton boutonNouveauVehicule;
    private JButton boutonListeClient;
    private JButton boutonNouvelleLocation;
    private JButton boutonRestitutionVehicule;
    private JButton boutonListeVehicule;


    public Interface(){
        //Création de la fenêtre
        setTitle("Interface Loueur");
        setSize(700,300);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        setContentPane(panneau);
        setButtons();
        setPanel();
        setActions();

        //Pour rendre la fenêtre visible et la fermer à la fin
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setButtons(){
        boutonNouveauClient= new JButton ("Nouveau Client");
        boutonNouveauClient.setPreferredSize(new Dimension(200, 40));
        boutonNouveauVehicule= new JButton ("Nouveau Véhicule");
        boutonNouveauVehicule.setPreferredSize(new Dimension(200, 40));
        boutonListeClient = new JButton ("Liste des clients");
        boutonListeClient.setPreferredSize(new Dimension(200, 40));
        boutonNouvelleLocation = new JButton ("Nouvelle Location");
        boutonNouvelleLocation.setPreferredSize(new Dimension(200, 40));
        boutonRestitutionVehicule = new JButton ("Resitution Véhicule");
        boutonRestitutionVehicule.setPreferredSize(new Dimension(200, 40));
        boutonListeVehicule = new JButton ("Liste des véhicules");
        boutonListeVehicule.setPreferredSize(new Dimension(200, 40));
    }




    private void setPanel(){
        panneau.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        panneau.add(boutonNouveauClient);
        panneau.add(boutonListeClient);
        panneau.add(boutonNouveauVehicule);
        panneau.add(boutonListeVehicule);
        panneau.add(boutonNouvelleLocation);
        panneau.add(boutonRestitutionVehicule);
    }

    private void setActions(){
        boutonNouveauClient.addActionListener(this);
        boutonNouveauVehicule.addActionListener(this);
        boutonNouvelleLocation.addActionListener(this);
        boutonRestitutionVehicule.addActionListener(this);
        boutonListeClient.addActionListener(this);
        boutonListeVehicule.addActionListener(this);
    }



    private void suppressionVehicule(){
        JOptionPane.showMessageDialog(rootPane, "Vous voulez supprimer un véhicule");
    }

    private void restitutionVehicule(){
        JOptionPane.showMessageDialog(rootPane, "Vous voulez restituer un véhicule");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boutonNouveauClient){
            AjoutClient client = new AjoutClient();
        }else if (e.getSource() == boutonNouveauVehicule){
            AjoutVehicule vehicule = new AjoutVehicule();
        }else if (e.getSource() == boutonNouvelleLocation){
            AjoutLocation location = new AjoutLocation();
        }else if (e.getSource() == boutonListeClient){
            AfficherListeClient liste = new AfficherListeClient();
        }else if (e.getSource() == boutonRestitutionVehicule){
            restitutionVehicule();
        }else if (e.getSource() == boutonListeVehicule){
            AfficherListeVehicule listeVeh = new AfficherListeVehicule();
        }
    }



    public static void main (String args[]){
        Interface loueur = new Interface();
    }

}
