 //Classe Voiture

public class Voiture extends VehiculeTerrestre {


   // Attributs
  private int nbPlace;


  // Constructeurs


  

   // Méthodes


// Getteurs et setteurs


    protected void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

  protected int getNbPlace () {
    return nbPlace;
  }

  // toString
//
    public String toString() {
        return "Voiture{" +//
                this.imprime() +
                "nbPlace=" + nbPlace +
                ", km=" + km +
                ", puissance=" + puissance +
                '}';
    }
}
