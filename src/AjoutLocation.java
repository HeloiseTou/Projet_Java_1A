import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;


public class AjoutLocation extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] clients;
    private JTable container;
    public static Client clientChoisi;

    AjoutLocation() {
        enTete = new String[]{"Nom", "Prénom", "Age", "Adresse", "Téléphone"};
        clients= listeClient();
        container = new JTable(clients, enTete);
        setTitle("Liste clients");
        setSize(700, 250);
        Dimension localisationFenetre= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int)localisationFenetre.getWidth()/2 - this.getWidth()/2, (int)localisationFenetre.getHeight()/2 - this.getHeight()/2);
        setResizable(false);
        setLayout(new BorderLayout());
        add(container.getTableHeader(), BorderLayout.PAGE_START);
        add(container, BorderLayout.CENTER);
        container.getSelectionModel().addListSelectionListener(this);
        setVisible(true);
    }



    public void valueChanged(ListSelectionEvent event) {
        clientChoisi = Stockage.listeDesClients.get(container.getSelectedRow());
        LocationVehicule listeVehicule = new LocationVehicule();
        this.setVisible(false);
        this.dispose();
    }


    private String[][] listeClient(){
        String[][] liste ;
        if (Stockage.listeDesClients==null){
            liste = new String[0][0];
        }else {
            liste = new String[Stockage.listeDesClients.size()][5];
            for (int i = 0; i < Stockage.listeDesClients.size(); i++) {
                liste[i] = new String[]{Stockage.listeDesClients.get(i).getNom(), Stockage.listeDesClients.get(i).getPrenom(), String.valueOf(Stockage.listeDesClients.get(i).getAge()), Stockage.listeDesClients.get(i).getAdresse(), Stockage.listeDesClients.get(i).getNumeroTel()};
            }
        }
        return (liste);

    }

}
