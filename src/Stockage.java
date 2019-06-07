import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Stockage {

    private static final String FILE_NAME = "clients.xml";
    public static ArrayList<Client> listeDesClients = new ArrayList<>();
    public static ArrayList<Moto> listeDesMotos = new ArrayList<>();
    public static ArrayList<Voiture> listeDesVoitures = new ArrayList<>();
    public static ArrayList<Avion> listeDesAvions = new ArrayList<>();
    public static ArrayList<Location> listeDesLocations = new ArrayList<>();
    public static int numeroVehicule;

    public Stockage(){}

    public static void main(String[] args) {
        try {
            Client nouveau = new Client("Obama","Barack",57,"Maison blanche","téléphone rouge");
            Stockage.listeDesClients.add(nouveau);
            try {
                XMLTools.encodeToFile(Stockage.listeDesClients, "clients.xml"); // sérialisation de la liste des clients
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList <Voiture> liste2 = (ArrayList<Voiture>) XMLTools.decodeFromFile("voitures.xml");
            Vehicule voit = liste2.get(0);
           // Date debut = (Date)"12/02/2020";
            //Location av = new Location("12/02/2020","20/02/2020",200,false,voit,nouveau);
            //Stockage.listeDesLocations.add(av);
           // XMLTools.encodeToFile(listeDesLocations, "Locations.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}