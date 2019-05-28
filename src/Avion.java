


 //Class Avion

public class Avion extends VehiculeAerien{
    public Avion () {
    };

    // toString()


    @Override
    public String toString() {
        return "Avion{" +
                "nbHeureVol=" + this.getNbHeureVol() +
                ", nbMoteur=" + this.getNbMoteur() +
                '}';
    }
}
