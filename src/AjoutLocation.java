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
        clientChoisi = SerializeStockage.listeDesClients.get(container.getSelectedRow());
        LocationVehicule listeVehicule = new LocationVehicule();
        this.setVisible(false);
        this.dispose();
    }


    private String[][] listeClient(){
        String[][] liste ;
        if (SerializeStockage.listeDesClients==null){
            liste = new String[0][0];
        }else {
            liste = new String[SerializeStockage.listeDesClients.size()][5];
            for (int i = 0; i < SerializeStockage.listeDesClients.size(); i++) {
                liste[i] = new String[]{SerializeStockage.listeDesClients.get(i).getNom(), SerializeStockage.listeDesClients.get(i).getPrenom(), String.valueOf(SerializeStockage.listeDesClients.get(i).getAge()), SerializeStockage.listeDesClients.get(i).getAdresse(), SerializeStockage.listeDesClients.get(i).getNumeroTel()};
            }
        }
        return (liste);

    }

}
