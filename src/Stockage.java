import java.util.ArrayList;

public class Stockage {
    public static ArrayList<Client> listeDesClients = new ArrayList<>();
    public static ArrayList<Moto> listeDesMotos = new ArrayList<>();
    public static ArrayList<Voiture> listeDesVoitures = new ArrayList<>();
    public static ArrayList<Avion> listeDesAvions = new ArrayList<>();
    public static ArrayList<Location> listeDesLocations = new ArrayList<>();
}
/*
    For example to write an object that can be read by the example in ObjectInputStream:

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Date());

        oos.close();
 */