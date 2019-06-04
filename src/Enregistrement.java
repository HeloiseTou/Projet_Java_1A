import java.util.ArrayList;
import java.util.Date;


public class Enregistrement {
    //attributs
    private ArrayList <Client> listeEnregistrementClient;
    private ArrayList<Location> listeEnregistrementLocation;
    private ArrayList <Avion> listeEnregistrementAvion;
    private ArrayList <Moto> listeEnregistrementMoto;
    private ArrayList <Voiture> listeEnregistrementVoiture;

    public Enregistrement() {
        this.listeEnregistrementClient = new ArrayList();
        this.listeEnregistrementAvion = new ArrayList();
        this.listeEnregistrementMoto = new ArrayList();
        this.listeEnregistrementVoiture = new ArrayList();
        this.listeEnregistrementLocation = new ArrayList();
    }

    //méthodes



    public void enregisterLocation(Date dateDebut, Date dateFin, int nbKmPrevisionnel, boolean reduction, Vehicule vehicule, Client client){
        Location loc = new Location(dateDebut, dateFin, nbKmPrevisionnel);
        loc.setReduction(reduction);
        loc.setVehicule(vehicule);
        loc.setClient(client);
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
