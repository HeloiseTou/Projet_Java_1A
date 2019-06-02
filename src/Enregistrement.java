import java.util.ArrayList;
import java.util.Date;


public class Enregistrement {
    //attributs
    public static ArrayList <Client> listeEnregistrementClient;
    public static ArrayList<Location> listeEnregistrementLocation;
    public static ArrayList <Avion> listeEnregistrementAvion;
    public static ArrayList <Moto> listeEnregistrementMoto;
    public static ArrayList <Voiture> listeEnregistrementVoiture;

    public Enregistrement() {
        this.listeEnregistrementClient = new ArrayList();
        this.listeEnregistrementAvion = new ArrayList();
        this.listeEnregistrementMoto = new ArrayList();
        this.listeEnregistrementVoiture = new ArrayList();
        this.listeEnregistrementLocation = new ArrayList();
    }

    //méthodes

    public void enregistrerClient(String nom, String prenom, int age, String adresse, String numeroTel){////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Client nouveauClient = new Client(nom, prenom, age, adresse, numeroTel);
        this.listeEnregistrementClient.add(nouveauClient);
    }

    public void enregisterLocation(Date dateDebut, Date dateFin, int prixPrevi, int nbKmPrevisionnel, boolean reduction, Vehicule vehicule, Client client){
        Location loc = new Location(dateDebut, dateFin, prixPrevi, nbKmPrevisionnel);
        loc.setReduction(reduction);
        loc.setVehicule(vehicule);
        loc.setClient(client);
    }

    public void enregistrerAvion(int nbHeureVol,String etat, String modele,String marque,int prixLocationParJour, int nbMoteur,int vitesseMax) {////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Avion av = new Avion();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, av);
        av.setNbHeureVol(nbHeureVol);
        av.setNbMoteur(nbMoteur);
        this.listeEnregistrementAvion.add(av);
    }
    public void enregistrerVoiture(int km, int nbPlace, String marque, String modele, int puissance,int prixLocationParJour, String etat, int vitesseMax){
        Voiture voitu = new Voiture();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, voitu);
        voitu.setKm(km);
        voitu.setNbPlace(nbPlace);
        voitu.setPuissance(puissance);
        this.listeEnregistrementVoiture.add(voitu);
    }
    public void enregistrerMoto(int km, String marque, int puissance,int prixLocationParJour, String etat,  String modele, int vitesseMax){
        Moto moto = new Moto();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, moto);
        moto.setKm(km);
        moto.setPuissance(puissance);
        this.listeEnregistrementMoto.add(moto);
    }


    public void setVehicule(String marque, String modele, int prixLocationParJour, int vitesseMax, String etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
    }


    public void supprimerMoto(String marq,String mod,int prixLocParJour,int veMax,String e){
        for (int i = 0; i < this.listeEnregistrementMoto.size(); i++){
            if(marq.equals(this.listeEnregistrementMoto.get(i).getMarque()) && mod.equals(this.listeEnregistrementMoto.get(i).getModele()) && (prixLocParJour==this.listeEnregistrementMoto.get(i).getPrixLocationParJour()) && (veMax==this.listeEnregistrementMoto.get(i).getVitesseMax()) && e.equals(this.listeEnregistrementMoto.get(i).getEtat())){
               this.listeEnregistrementMoto.remove(this.listeEnregistrementMoto.get(i));
            }
        }
    }


    public String toStringMoto() {
        String result = "+";
        if(!this.listeEnregistrementMoto.isEmpty()) {
            for (int i = 0; i < this.listeEnregistrementMoto.size(); i++) {
                result += " " + this.listeEnregistrementMoto.get(i).toString();
            }
        }
        return "Enregistrement{" +
                "ListeEnregistrement=" + result +
                '}';
    }

    public String toStringAvion() {
        String result = "+";
        if(!this.listeEnregistrementAvion.isEmpty()) {
            for (int i = 0; i < this.listeEnregistrementAvion.size(); i++) {
                result += " " + this.listeEnregistrementAvion.get(i).toString();
            }
        }
        return "Enregistrement{" +
                "ListeEnregistrement=" + result +
                '}';
    }

}
