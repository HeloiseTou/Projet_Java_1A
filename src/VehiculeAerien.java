public class VehiculeAerien extends Vehicule {


    // Attributs

    protected int nbHeureVol;
    protected int nbMoteur;


    // Constructeurs


    // Méthodes




    // Getteurs et setteurs


    // remplace la valeur de par nbHeureVol
    //  nouvelle : la nouvelle valeur de nbHeureVol
    private void setNbHeureVol (int nouvelle) {
        nbHeureVol = nouvelle;
    }

    // reçoit la valeur de nbHeureVol

    private int getNbHeureVol () {
        return nbHeureVol;
    }

    // remplace la valeur de par nbMoteur


    private void setNbMoteur (int nouvelle) {
        nbMoteur = nouvelle;
    }

    // reçoit la valeur de nbMoteur

    private int getNbMoteur () {
        return nbMoteur;
    }


}
