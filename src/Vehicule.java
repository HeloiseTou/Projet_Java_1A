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

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public String getModele() {
    return modele;
  }

  public void setModele(String modele) {
    this.modele = modele;
  }

  public int getPrixLocationParJour() {
    return prixLocationParJour;
  }

  public void setPrixLocationParJour(int prixLocationParJour) {
    this.prixLocationParJour = prixLocationParJour;
  }

  public int getVitesseMax() {
    return vitesseMax;
  }

  public void setVitesseMax(int vitesseMax) {
    this.vitesseMax = vitesseMax;
  }

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
