


 //Classe Moto

public class Moto extends VehiculeTerrestre {


   // Méthodes

    //toString
    /**
     * affiche cette Moto
     */
    public String toString() {
        return "Moto{" +
                this.imprime() +
                "km=" + km +
                ", puissance=" + puissance +
                '}';
    }
}
