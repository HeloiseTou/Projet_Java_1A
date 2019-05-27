

/**
 * Class Vehicule
 */
public class Vehicule {

  //
  // Fields
  //

  private String marque;
  private String modele;
  private int prixLocationParJour;
  private int vitesseMax;
  private String etat;
  
  //
  // Constructors
  //
  public Vehicule () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of marque
   * @param newVar the new value of marque
   */
  private void setMarque (String newVar) {
    marque = newVar;
  }

  /**
   * Get the value of marque
   * @return the value of marque
   */
  private String getMarque () {
    return marque;
  }

  /**
   * Set the value of modele
   * @param newVar the new value of modele
   */
  private void setModele (String newVar) {
    modele = newVar;
  }

  /**
   * Get the value of modele
   * @return the value of modele
   */
  private String getModele () {
    return modele;
  }

  /**
   * Set the value of prixLocationParJour
   * @param newVar the new value of prixLocationParJour
   */
  private void setPrixLocationParJour (int newVar) {
    prixLocationParJour = newVar;
  }

  /**
   * Get the value of prixLocationParJour
   * @return the value of prixLocationParJour
   */
  private int getPrixLocationParJour () {
    return prixLocationParJour;
  }

  /**
   * Set the value of vitesseMax
   * @param newVar the new value of vitesseMax
   */
  private void setVitesseMax (int newVar) {
    vitesseMax = newVar;
  }

  /**
   * Get the value of vitesseMax
   * @return the value of vitesseMax
   */
  private int getVitesseMax () {
    return vitesseMax;
  }

  /**
   * Set the value of etat
   * @param newVar the new value of etat
   */
  private void setEtat (String newVar) {
    etat = newVar;
  }

  /**
   * Get the value of etat
   * @return the value of etat
   */
  private String getEtat () {
    return etat;
  }

  //
  // Other methods
  //

}
