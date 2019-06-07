import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        try {
            Stockage.listeDesClients = (ArrayList<Client>) XMLTools.decodeFromFile("clients.xml");
            Stockage.listeDesVoitures = (ArrayList<Voiture>) XMLTools.decodeFromFile("voitures.xml");
            Stockage.listeDesAvions = (ArrayList<Avion>) XMLTools.decodeFromFile("avions.xml");
            Stockage.listeDesMotos = (ArrayList<Moto>) XMLTools.decodeFromFile("motos.xml");
            Stockage.listeDesLocations = (ArrayList<Location>) XMLTools.decodeFromFile("locations.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Interface loueur = new Interface();

    }
}
