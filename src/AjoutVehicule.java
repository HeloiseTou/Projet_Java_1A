import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutVehicule extends JFrame implements ActionListener{

    //Déclaration des variable lors de l'ajout d'un véhicule
    private JPanel panneau = new JPanel();
    private JLabel message;
    private JButton avion;
    private JButton moto;
    private JButton voiture;

    AjoutVehicule() {
        message = new JLabel("Quel est le type de véhicule que vous voulez enregistrer ?");
        avion = new JButton("Avion");
        avion.setPreferredSize(new Dimension(150, 40));
        moto = new JButton("Moto");
        moto.setPreferredSize(new Dimension(150, 40));
        voiture = new JButton("Voiture");
        voiture.setPreferredSize(new Dimension(150, 40));
        setTitle("Ajout véhicule");
        setLayout(new GridLayout(2, 1));
        setSize(600, 200);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        getContentPane().add(message);
        getContentPane().add(panneau);
        panneau.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));
        panneau.add(avion);
        panneau.add(moto);
        panneau.add(voiture);
        avion.addActionListener(this);
        moto.addActionListener(this);
        voiture.addActionListener(this);


        //Pour rendre la fenêtre visible et la fermer à la fin
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== avion){
            AjoutAvion avion = new AjoutAvion();
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==moto){
            AjoutMoto moto = new AjoutMoto();
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==voiture){
            this.setVisible(false);
            this.dispose();
        }
    }
}
