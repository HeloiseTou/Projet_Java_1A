import java.io.*;
import java.util.ArrayList;

class Stockage implements Serializable {}

public class SerializeStockage{

    private static final String FILE_NAME = "stockage.xml";
    public static ArrayList<Client> listeDesClients = new ArrayList<>();
    public static ArrayList<Moto> listeDesMotos = new ArrayList<>();
    public static ArrayList<Voiture> listeDesVoitures = new ArrayList<>();
    public static ArrayList<Avion> listeDesAvions = new ArrayList<>();
    public static ArrayList<Location> listeDesLocations = new ArrayList<>();

    public static void main(String[] args) {
       Stockage me = new Stockage(); // 2

        // sérialisation
        try {
            FileOutputStream fs = new FileOutputStream(FILE_NAME);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(me); // 3
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // desérialisation
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            me = (Stockage) ois.readObject(); // 4
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}