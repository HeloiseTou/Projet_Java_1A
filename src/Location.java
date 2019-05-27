import java.util.Date;

/**
 * Class Location
 */
public class Location {

  //
  // Fields
  //

  private Date dateDebut;
  private Date dateFin;
  private int prixPrevisionnel;
  private int nbKmPrevisionnel;
  private boolean reduction;
  
  //
  // Constructors
  //
  public Location () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dateDebut
   * @param newVar the new value of dateDebut
   */
  private void setDateDebut (Date newVar) {
    dateDebut = newVar;
  }

  /**
   * Get the value of dateDebut
   * @return the value of dateDebut
   */
  private Date getDateDebut () {
    return dateDebut;
  }

  /**
   * Set the value of dateFin
   * @param newVar the new value of dateFin
   */
  private void setDateFin (Date newVar) {
    dateFin = newVar;
  }

  /**
   * Get the value of dateFin
   * @return the value of dateFin
   */
  private Date getDateFin () {
    return dateFin;
  }

  /**
   * Set the value of prixPrevisionnel
   * @param newVar the new value of prixPrevisionnel
   */
  private void setPrixPrevisionnel (int newVar) {
    prixPrevisionnel = newVar;
  }

  /**
   * Get the value of prixPrevisionnel
   * @return the value of prixPrevisionnel
   */
  private int getPrixPrevisionnel () {
    return prixPrevisionnel;
  }

  /**
   * Set the value of nbKmPrevisionnel
   * @param newVar the new value of nbKmPrevisionnel
   */
  private void setNbKmPrevisionnel (int newVar) {
    nbKmPrevisionnel = newVar;
  }

  /**
   * Get the value of nbKmPrevisionnel
   * @return the value of nbKmPrevisionnel
   */
  private int getNbKmPrevisionnel () {
    return nbKmPrevisionnel;
  }

  /**
   * Set the value of reduction
   * @param newVar the new value of reduction
   */
  private void setReduction (boolean newVar) {
    reduction = newVar;
  }

  /**
   * Get the value of reduction
   * @return the value of reduction
   */
  private boolean getReduction () {
    return reduction;
  }

  //
  // Other methods
  //

}
