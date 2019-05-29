import java.util.ArrayList;


public class Enregistrement {
    //attributs
    private ArrayList listeEnregistrement;

    public Enregistrement() {
        this.listeEnregistrement = new ArrayList();
    }

    //méthodes

    public void enregistrerClient(String nom, String prenom, int age, String adresse, String numeroTel){////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        Client nouveauClient = new Client(nom, prenom, age, adresse, numeroTel);
        this.listeEnregistrement.add(nouveauClient);
    }

    public void enregistrerVehicule(String marque,String modele,int prixLocationParJour,int vitesseMax,String etat,boolean aerien){////////// est ce qu'on doit mettre aussi dans l'enregistrement du noveau client la location???
        if(aerien){
            Vehicule av = new Avion();
            setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, av);
            Avion nouveau = (Avion) av;
            this.listeEnregistrement.add(nouveau);
        }
        else{
            Vehicule voitu = new Voiture();
            setVehicule(marque, modele, prixLocationParJour, vitesseMax, etat, voitu);
            Voiture nouveau = (Voiture) voitu;
            this.listeEnregistrement.add(nouveau);
        }
    }

    private void setVehicule(String marque, String modele, int prixLocationParJour, int vitesseMax, String etat, Vehicule vehicule) {
        vehicule.setMarque(marque);
        vehicule.setModele(modele);
        vehicule.setEtat(etat);
        vehicule.setPrixLocationParJour(prixLocationParJour);
        vehicule.setVitesseMax(vitesseMax);
    }


    @Override
    public String toString() {
        String result = "+";
        if(!this.listeEnregistrement.isEmpty()) {
            for (int i = 0; i < this.listeEnregistrement.size(); i++) {
                result += " " + this.listeEnregistrement.get(i).toString();
            }
        }
        return "Enregistrement{" +
                "ListeEnregistrement=" + result +
                '}';
    }
}
