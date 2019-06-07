import java.io.*;
import java.util.ArrayList;

public class Stockage {

    private static final String FILE_NAME = "stockage.xml";
    public static ArrayList<Client> listeDesClients = new ArrayList<>();
    public static ArrayList<Moto> listeDesMotos = new ArrayList<>();
    public static ArrayList<Voiture> listeDesVoitures = new ArrayList<>();
    public static ArrayList<Avion> listeDesAvions = new ArrayList<>();
    public static ArrayList<Location> listeDesLocations = new ArrayList<>();
    public static int numeroVehicule;

    public Stockage(){}

    public static void main(String[] args) {
        try {
            Stockage user = new Stockage();
            Client nouveau = new Client("Joe","Dalton",18,"3 rue des pommiers","003784993");
            Client nouveau2 = new Client("Gui","Toup",21,"67 reu Marcadet","Touuuup");
            Stockage.listeDesClients.add(nouveau);
            Stockage.listeDesClients.add(nouveau2);
            XMLTools.encodeToFile(listeDesClients, "stockage.xml");
            System.out.println(listeDesClients.toString());
            ArrayList <Client> liste2 = (ArrayList<Client>) XMLTools.decodeFromFile("stockage.xml");
            System.out.println(liste2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}