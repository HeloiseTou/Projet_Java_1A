import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener{

    //Déclaration des éléments à mettre dans la fenêtre
    private JPanel panneau = new JPanel();
    private JButton boutonNouveauClient;
    private JButton boutonNouveauVehicule;
    private JButton boutonSuppressionVehicule;
    private JButton boutonNouvelleLocation;
    private JButton boutonRestitutionVehicule;
    private JComboBox listeVehicule;


    public Interface(){
        //Création de la fenêtre
        setTitle("Interface Loueur");
        setSize(700,300);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        setContentPane(panneau);
        setButtons();
        setJComboBox();
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
        boutonSuppressionVehicule = new JButton ("Supprimer Véhicule");
        boutonSuppressionVehicule.setPreferredSize(new Dimension(200, 40));
        boutonNouvelleLocation = new JButton ("Nouvelle Location");
        boutonNouvelleLocation.setPreferredSize(new Dimension(200, 40));
        boutonRestitutionVehicule = new JButton ("Resitution Véhicule");
        boutonRestitutionVehicule.setPreferredSize(new Dimension(200, 40));
    }

    private void setJComboBox(){
        String[] typeVehicule = {"Avions","Motos","Voitures"};
        listeVehicule = new JComboBox(typeVehicule);
        listeVehicule.setPreferredSize(new Dimension(200, 40));
    }



    private void setPanel(){
        panneau.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        panneau.add(boutonNouveauClient);
        panneau.add(boutonNouveauVehicule);
        panneau.add(boutonNouvelleLocation);
        panneau.add(boutonSuppressionVehicule);
        panneau.add(boutonRestitutionVehicule);
        panneau.add(listeVehicule);
    }

    private void setActions(){
        boutonNouveauClient.addActionListener(this);
        boutonNouveauVehicule.addActionListener(this);
        boutonNouvelleLocation.addActionListener(this);
        boutonRestitutionVehicule.addActionListener(this);
        boutonSuppressionVehicule.addActionListener(this);
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
