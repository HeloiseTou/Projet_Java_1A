import java.util.ArrayList;


public class Enregistrement {
    //attributs
    private ArrayList listeEnregistrementClient;
    private ArrayList <Vehicule> listeEnregistrementVehicule;

    public Enregistrement() {
        this.listeEnregistrementClient = new ArrayList();
        this.listeEnregistrementVehicule = new ArrayList();
    }

    //méthodes

    public void enregistrerClient(String nom, String prenom, int age, String adresse, String numeroTel){////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Client nouveauClient = new Client(nom, prenom, age, adresse, numeroTel);
        this.listeEnregistrementClient.add(nouveauClient);
    }

    public void enregistrerAvion(String marque,String modele,int prixLocationParJour,int vitesseMax,String etat) {////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Vehicule av = new Avion();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, av);
        Avion nouveau = (Avion) av;
        this.listeEnregistrementVehicule.add(nouveau);
    }
    public void enregistrerVoiture(String marque,String modele,int prixLocationParJour,int vitesseMax,String etat){
        Vehicule voitu = new Voiture();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, voitu);
        Voiture nouveau = (Voiture) voitu;
        this.listeEnregistrementVehicule.add(nouveau);
    }
    public void enregistrerMoto(String marque,String modele,int prixLocationParJour,int vitesseMax,String etat){
        Vehicule mot = new Voiture();
        setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, mot);
        Moto nouveau = (Moto) mot;
        this.listeEnregistrementVehicule.add(nouveau);
    }


    public void setVehicule(String marque, String modele, int prixLocationParJour, int vitesseMax, String etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
    }
    
    public void supprmierMoto(String marq,String mod,int prixLocParJour,int veMax,String e){
        for (int i = 0; i < this.listeEnregistrementVehicule.size(); i++){
            if(marq.equals(this.listeEnregistrementVehicule.get(i).getMarque()) && mod.equals(this.listeEnregistrementVehicule.get(i).getModele()) && (prixLocParJour==this.listeEnregistrementVehicule.get(i).getPrixLocationParJour()) && (veMax==this.listeEnregistrementVehicule.get(i).getVitesseMax()) && e.equals(this.listeEnregistrementVehicule.get(i).getEtat())){
               this.listeEnregistrementVehicule.remove(this.listeEnregistrementVehicule.get(i));
            }
        }
    }


    public String toStringVehicule() {
        String result = "+";
        if(!this.listeEnregistrementVehicule.isEmpty()) {
            for (int i = 0; i < this.listeEnregistrementVehicule.size(); i++) {
                result += " " + this.listeEnregistrementVehicule.get(i).toString();
            }
        }
        return "Enregistrement{" +
                "ListeEnregistrement=" + result +
                '}';
    }
}
