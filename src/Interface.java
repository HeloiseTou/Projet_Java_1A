import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener{

    //Déclaration des éléments à mettre dans la fenêtre
    private JButton boutonConversion;
    private JButton boutonReset;
    private JList<String>  deviseDepart;
    private JList<String>  deviseArrivee;
    private JTextField entree;
    private JTextField sortie;


    Interface(){
        //Création de la fenêtre
        //setBounds(100,100,700,200);
        setTitle("ConvertisseurBis");
        setLayout(new GridLayout(3,2)); //Création d'une grille de 3 lignes et 2 colonnes
        setButtons();
        setList();
        setTextField();
        setFenetre();
        setActions();
        setSize(700,300);

        //Pour rendre la fenêtre visible et la fermer à la fin
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setButtons(){
        boutonConversion = new JButton ("convertir");
        boutonReset = new JButton ("reset");
    }

    private void setList(){

        String[] tableauDevises = {"Euros", "Livres", "Dollars américains", "Dollars canadiens"};
        deviseDepart = new JList<String>(tableauDevises);
        deviseArrivee = new JList<String>(tableauDevises);
    }

    private void setTextField(){
        entree = new JTextField("");
        sortie = new JTextField("");
    }

    private void setFenetre(){
        getContentPane().add(deviseDepart);
        getContentPane().add(entree);
        getContentPane().add(deviseArrivee);
        getContentPane().add(sortie);
        getContentPane().add(boutonConversion);
        getContentPane().add(boutonReset);
    }

    private void setActions(){
        boutonConversion.addActionListener(this);
        boutonReset.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boutonConversion){
            if ((entree.getText().equals("")) && (sortie.getText().equals(""))){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir le premier champ");
            } else if (sortie.getText().equals("")){
                Double taux = calculTaux(deviseDepart.getSelectedIndex(), deviseArrivee.getSelectedIndex());
                taux = 2.0;
                double valeurDepart = Double.parseDouble(this.entree.getText());
                double valeurArrivee = taux*valeurDepart;
                String valeurArriveeStr = String.valueOf(valeurArrivee);
                sortie.setText(valeurArriveeStr);
            }else if (entree.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir uniquement le premier champ");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir uniquement le premier champ");
            }
        } else if (e.getSource() == boutonReset){
            entree.setText("");
            sortie.setText("");
        }
    }

    private Double calculTaux (int deviseDepart, int deviseArrivee){
        Double[] prixEuro ={1.0, 1.13, 0.89,0.66};
        Double tauxFinal = prixEuro[deviseDepart]*(1/prixEuro[deviseArrivee]);
        return tauxFinal;
    }

    public static void main (String args []){
        Interface convert = new Interface();
    }

}
