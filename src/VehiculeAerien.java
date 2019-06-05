abstract class VehiculeAerien extends Vehicule {


    // Attributs

    private int nbHeureVol;
    private int nbMoteur;


    // Méthodes




    // Getteurs et setteurs

    /**
     * renvoie  le nombre d'heures de vol
     * @return  nbHeureVol le nombre d'heures de vol
     */
    public int getNbHeureVol() {
        return nbHeureVol;
    }

    public void setNbHeureVol(int nbHeureVol) {
        this.nbHeureVol = nbHeureVol;
    }
    /**
     * renvoie  le nombre de moteurs
     * @return  nbMoteur le nombre de moteurs
     */
    public int getNbMoteur() {
        return nbMoteur;
    }

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

}
