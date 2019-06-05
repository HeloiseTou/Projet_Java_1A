abstract class Vehicule {


   // Attributs


  protected String marque;
  protected String modele;
  protected int prixLocationParJour;
  protected int vitesseMax;
  protected boolean etat;
  

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

  public void setVitesseMax(int vitesseMax) {
    this.vitesseMax = vitesseMax;
  }
  /**
   * renvoie  l'état de ce véhicule (s'il est disponible ou non)
   * @return  etat l'état de ce véhicule
   */
  public boolean getEtat() {
    return etat;
  }

  public void setEtat(boolean etat) {
    this.etat = etat;
  }


  /**
   * affiche ce Véhicule
   */
  public String imprime(){
    return  "marque='" + marque + '\'' +
            ", modele='" + modele + '\'' +
            ", prixLocationParJour=" + prixLocationParJour +
            ", vitesseMax=" + vitesseMax +
            ", etat='" + etat + '\'' +
            ", ";
  }
  public abstract String toString();

}
