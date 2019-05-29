


 //Class Avion

public class Avion extends VehiculeAerien{
    public Avion () {
    };

    // toString()


    public String toString() {
        return "Avion{" +
                this.imprime() +
                "nbHeureVol=" + this.getNbHeureVol() +
                ", nbMoteur=" + this.getNbMoteur() +
                '}';
    }
}
