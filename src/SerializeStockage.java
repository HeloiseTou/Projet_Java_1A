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
    public static int numeroVehicule;

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

/*
public final class XMLTools {


    private XMLTools() {}

     * Serialisation d'un objet dans un fichier
     * @param object objet a serialiser
     * @param filename chemin du fichier

public static void encodeToFile(Object object, String fileName) throws FileNotFoundException, IOException {
    // ouverture de l'encodeur vers le fichier
    XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fileName));
    try {
        // serialisation de l'objet
        encoder.writeObject(object);
        encoder.flush();
    } finally {
        // fermeture de l'encodeur
        encoder.close();
    }
}
}
public class User {

    private String login;
    private String password;

    public User() {
	    this("anonymous", "");
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return login;
    }

    public static void main(String[] args) {
        try {
            User user = new User("admin", "azerty");
            XMLTools.encodeToFile(user, "user.xml");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

Désérialisation :

 * Deserialisation d'un objet depuis un fichier
 * @param filename chemin du fichier
 *
 */
/*
public static Object decodeFromFile(String fileName) throws FileNotFoundException, IOException {
    Object object = null;
    // ouverture de decodeur
    XMLDecoder decoder = new XMLDecoder(new FileInputStream(fileName));
    try {
        // deserialisation de l'objet
        object = decoder.readObject();
    } finally {
        // fermeture du decodeur
        decoder.close();
    }
    return object;
}

public static void main(String[] args) {
    try {
        User user = new User("admin", "azerty");
        XMLTools.encodeToFile(user, "user.xml");
        System.out.println(user);
        user = new User("newAdmin", "123456");
        System.out.println(user);
        user = (User) XMLTools.decodeFromFile("user.xml");
        System.out.println(user);
    } catch(Exception e) {
        e.printStackTrace();
    }
}
*/