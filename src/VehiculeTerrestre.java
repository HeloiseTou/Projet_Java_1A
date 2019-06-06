abstract class VehiculeTerrestre extends Vehicule {
    protected int km;
    protected int puissance;

    // Getteurs et setteurs




    protected void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    /**
     * renvoie  la puissance de la voiture ou de la moto
     * @return  puissance la puissance de la voiture ou de la moto
     */
    public int getPuissance () {
        return this.puissance;
    }
    /**
     * renvoie  le nombre de km de la voiture ou de la moto
     * @return  km le nombre de km de la voiture ou de la moto
     */
    public int getKm () {
        return this.km;
    }

    /**
     * Donne à l'attribut km la nouvelle valeur km.
     * @param km : les km
     */
    protected void setKm(int km) {
        this.km = km;
    }


}
