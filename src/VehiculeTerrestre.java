abstract class VehiculeTerrestre extends Vehicule {
    private int km;
    private int puissance;

    // Getteurs et setteurs


    // remplace la valeur de par km
    //  nouvelle : la nouvelle valeur de km

    private void setKm (int nouvelle) {
        km = nouvelle;
    }

    // reçoit la valeur de

    private int getKm () {
        return km;
    }

    // remplace la valeur de par puissance
    //  nouvelle : la nouvelle valeur de puissance

    private void setPuissance (int nouvelle) {
        puissance = nouvelle;
    }

    // reçoit la valeur de puissance

    private int getPuissance () {
        return puissance;
    }

}
