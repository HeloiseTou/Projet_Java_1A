import javax.swing.*;

public class AjoutLocation {
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

    AjoutLocation() {
        AfficherListeClient listeClient = new AfficherListeClient();
        Client client = AfficherListeClient.clientChoisi;
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
    }
}
