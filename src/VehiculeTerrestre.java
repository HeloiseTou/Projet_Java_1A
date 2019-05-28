abstract class VehiculeTerrestre extends Vehicule {
    protected int km;
    protected int puissance;

    // Getteurs et setteurs




    protected void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getPuissance () {
        return this.puissance;
    }

    public int getKm () {
        return this.km;
    }

    protected void setKm(int km) {
        this.km = km;
    }

    //toString
    public abstract String toString();

}
