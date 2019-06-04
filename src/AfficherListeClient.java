import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.String;
public class AfficherListeClient extends JFrame implements ListSelectionListener {

    private String[] enTete;
    private String[][] clients;
    private JTable container;
    public static Client clientChoisi;

    AfficherListeClient() {
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
            clientChoisi = Enregistrement.listeEnregistrementClient.get(container.getSelectedRow());
        }


    private String[][] listeClient(){
        String[][] liste ;
        if (Enregistrement.listeEnregistrementClient==null){
            liste = new String[0][0];
        }else {
            liste = new String[Enregistrement.listeEnregistrementClient.size()][5];
            for (int i = 0; i < Enregistrement.listeEnregistrementClient.size(); i++) {
                liste[i] = new String[]{Enregistrement.listeEnregistrementClient.get(i).getNom(), Enregistrement.listeEnregistrementClient.get(i).getPrenom(), String.valueOf(Enregistrement.listeEnregistrementClient.get(i).getAge()), Enregistrement.listeEnregistrementClient.get(i).getAdresse(), Enregistrement.listeEnregistrementClient.get(i).getNumeroTel()};
            }
        }
        return (liste);

    }
}
