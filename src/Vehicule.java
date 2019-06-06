abstract class Vehicule {


   // Attributs


  protected String marque;
  protected String modele;
  protected int prixLocationParJour;
  protected int vitesseMax;
  

  // Constructeurs

  public Vehicule () { };


   // Méthodes

  public void prix(){ //////////////////////////////////////////définir comment on fixe un prix !!!!!!!

  }


 // Getteurs et setteurs et setteurs
  /**
   * renvoie  la marque de ce véhicule
   * @return  marque la marque de ce véhicule
   */
  public String getMarque() {
    return marque;
  }

  /**
   * Donne la valeur marque à l'attribut marque de ce Véhicule
   * @param  marque : la modèle de ce véhicule
   */
  public void setMarque(String marque) {
    this.marque = marque;
  }
  /**
   * renvoie  le modèle de ce véhicule
   * @return  modele : la modèle de ce véhicule
   */
  public String getModele() {
    return modele;
  }

  /**
   * Donne la valeur modele à l'attribut modele de ce Véhicule
   * @param  modele : la modèle de ce véhicule
   */
  public void setModele(String modele) {
    this.modele = modele;
  }

  /**
   * renvoie  le prix de location par jour de ce véhicule
   * @return  prixLocationParJour : le prix de location par jour de ce véhicule
   */
  public int getPrixLocationParJour() {
    return prixLocationParJour;
  }

  /**
   * Donne la valeur prixLocationParJour à l'attribut prixLocationParJour de ce Véhicule
   * @param  prixLocationParJour : le prix de location par jour de ce véhicule
   */
  public void setPrixLocationParJour(int prixLocationParJour) {
    this.prixLocationParJour = prixLocationParJour;
  }
  /**
   * renvoie  la vitesse maximale de ce véhicule
   * @return  vitesseMax la vitesse maximale de ce véhicule
   */
  public int getVitesseMax() {
    return vitesseMax;
  }

  /**
   * Donne la valeur vitesseMax à l'attribut vitesseMax de ce Véhicule
   * @param  vitesseMax : la vitesse maximale de ce véhicule
   */
  public void setVitesseMax(int vitesseMax) {
    this.vitesseMax = vitesseMax;
  }

  /**
   * affiche ce Véhicule
   */
  public String imprime(){
    return  "marque='" + marque + '\'' +
            ", modele='" + modele + '\'' +
            ", prixLocationParJour=" + prixLocationParJour +
            ", vitesseMax=" + vitesseMax +
            ", ";
  }
  public abstract String toString();

}
