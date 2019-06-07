import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfficherFenetreLocation extends JFrame implements ActionListener {
    private JLabel dateDebut;
    private JLabel dateFin;
    private JLabel kmPrevi;
    private JTextField entreeDateDebut;
    private JTextField entreeDateFin;
    private JTextField entreeKm;
    private JButton annuler;
    private JButton confirmer;
    private int prixPrevi;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private Vehicule vehiculeChoisi ;
    private String typeVehicule;

    AfficherFenetreLocation(Client client, Vehicule vehicule, String typeVehi) {
        typeVehicule = typeVehi;
        dateDebut = new JLabel("Date de début de la location");
        dateFin = new JLabel("Date de fin de la location");
        kmPrevi = new JLabel("Nombre de km prévisionnel");
        entreeDateDebut = new JTextField("");
        entreeDateFin = new JTextField("");
        entreeKm = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
        vehiculeChoisi = vehicule;
        setTitle("Ajout d'une location");
        setLayout(new GridLayout(8, 2));
        setSize(800, 400);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        getContentPane().add(dateDebut);
        getContentPane().add(entreeDateDebut);
        getContentPane().add(dateFin);
        getContentPane().add(entreeDateFin);
        getContentPane().add(kmPrevi);
        getContentPane().add(entreeKm);
        getContentPane().add(annuler);
        getContentPane().add(confirmer);
        confirmer.addActionListener(this);
        annuler.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== annuler){
            if (typeVehicule.equals("avion")) {
                for (int i=0; i<Stockage.listeDesAvions.size(); i++){
                    if (Stockage.listeDesAvions.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesAvions.get(i).setEtat(false);
                    }
                }
            }
            if (typeVehicule.equals("moto")) {
                for (int i=0; i<Stockage.listeDesMotos.size(); i++){
                    if (Stockage.listeDesMotos.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesMotos.get(i).setEtat(false);
                    }
                }
            }
            if (typeVehicule.equals("voiture")) {
                for (int i=0; i<Stockage.listeDesVoitures.size(); i++){
                    if (Stockage.listeDesVoitures.get(i).getId()==vehiculeChoisi.getId()){
                        Stockage.listeDesVoitures.get(i).setEtat(false);
                    }
                }
            }
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==confirmer){
            if(entreeDateDebut.getText().equals("")||entreeDateFin.getText().equals("") ||  entreeKm.getText().equals("") ){
                JOptionPane.showMessageDialog(rootPane, "Merci de remplir toutes les cases");
            }else {
                boolean reduction = false;
                try {
                    Date dateDeb = formatter.parse(entreeDateDebut.getText());
                    Date dateFi = formatter.parse(entreeDateFin.getText());
                    enregistrerLocation(dateDeb, dateFi, Integer.valueOf(entreeKm.getText()), reduction, vehiculeChoisi, AjoutLocation.clientChoisi);
                } catch (ParseException eve) {
                    eve.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Prix prévisionnel = "+prixPrevi+" euros");
            JOptionPane.showMessageDialog(rootPane, "Location enregistrée !");
            this.setVisible(false);
            this.dispose();
        }
    }

    /**
     * Enregistre la location dans la liste des locations
     * @param  dateDebut : la date du début de la location
     * @param  dateFin :la date de fin de la  location
     * @param nbKmPrevisionnel : le nombre de km prévisionnels
     * @param reduction : booléen indiquant si la réduction est accordée ou non
     * @param vehicule : le véhicule loué
     * @param client : le locataire
     */

    public void enregistrerLocation(Date dateDebut, Date dateFin, int nbKmPrevisionnel, boolean reduction, Vehicule vehicule, Client client){
        Location loc = new Location(dateDebut, dateFin, nbKmPrevisionnel, reduction, vehicule, client);
        prixPrevi = loc.prixPrevisionnel();
        if (loc.accordReduction()) {
            AccordReduction reduc = new AccordReduction();
            if (AccordReduction.reduc == 0) {
                loc.setReduction(true);
            }
        }
        Stockage.listeDesLocations.add(loc);
        try {
            XMLTools.encodeToFile(Stockage.listeDesLocations, "location.xml"); // sérialisation de la liste des locations
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
