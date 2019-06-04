import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AfficherFenetreLocation extends JFrame implements ActionListener {
    private JLabel dateDebut;
    private JLabel dateFin;
    private JLabel prixPrevi;
    private JLabel kmPrevi;
    private JTextField entreeDateDebut;
    private JTextField entreeDateFin;
    private JTextField entreePrix;
    private JTextField entreeKm;
    private JButton annuler;
    private JButton confirmer;
    public static ArrayList<Location> listeDesLocations = new ArrayList<>();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    AfficherFenetreLocation() {
        dateDebut = new JLabel("Date de début de la location");
        dateFin = new JLabel("Date de fin de la location");
        prixPrevi = new JLabel("Prix prévisionnel");
        kmPrevi = new JLabel("Nombre de km prévisionnel");
        entreeDateDebut = new JTextField("");
        entreeDateFin = new JTextField("");
        entreePrix = new JTextField("");
        entreeKm = new JTextField("");
        annuler = new JButton("Annuler");
        confirmer = new JButton("Confirmer");
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
        getContentPane().add(prixPrevi);
        getContentPane().add(entreePrix);
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
            this.setVisible(false);
            this.dispose();
        }else if (e.getSource()==confirmer){
            boolean reduction = true;
            try {
                Date dateDeb = formatter.parse(entreeDateDebut.getText());
                Date dateFi = formatter.parse(entreeDateFin.getText());
                enregistrerLocation(dateDeb, dateFi,  Integer.valueOf(entreeKm.getText()),  Integer.valueOf(entreePrix.getText()), reduction, AfficherListeVehicule.vehiculeChoisi, AfficherListeClient.clientChoisi);
            } catch (ParseException eve) {
                eve.printStackTrace();
            }
            JOptionPane.showMessageDialog(rootPane, "Location enregistrée !");
            this.setVisible(false);
            this.dispose();
        }
    }


    public void enregistrerLocation(Date dateDebut, Date dateFin, int prixPrevi, int nbKmPrevisionnel, boolean reduction, Vehicule vehicule, Client client){
        Location loc = new Location(dateDebut, dateFin, prixPrevi, nbKmPrevisionnel);
        loc.setReduction(reduction);
        loc.setVehicule(vehicule);
        loc.setClient(client);
        this.listeDesLocations.add(loc);
    }
}
