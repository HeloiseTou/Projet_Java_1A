import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SuppressionVehicule extends JFrame implements ActionListener{

    private JPanel panneau = new JPanel();
    private JLabel message;
    private JButton avion;
    private JButton moto;
    private JButton voiture;

    SuppressionVehicule() {
        message = new JLabel("Quel est le type de véhicule que vous voulez supprimer ?");
        avion = new JButton("Avion");
        avion.setPreferredSize(new Dimension(150, 40));
        moto = new JButton("Moto");
        moto.setPreferredSize(new Dimension(150, 40));
        voiture = new JButton("Voiture");
        voiture.setPreferredSize(new Dimension(150, 40));
        setTitle("Location véhicule");
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
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== avion){
            SuppressionAvion avion = new SuppressionAvion();
        }else if (e.getSource()==moto){
            SuppressionMoto moto = new SuppressionMoto();
        }else if (e.getSource()==voiture){
            SuppressionVoiture voit = new SuppressionVoiture();
        }
        this.setVisible(false);
        this.dispose();
    }
}
