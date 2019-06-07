import java.util.Date;

public class Location {


   // Attributs


  private Date dateDebut;
  private Date dateFin;
  private int nbKmPrevisionnel;
  private boolean reduction;
  private Vehicule vehicule;
  private Client client;
  

   //Constructeurs

  public Location(Date dateDebut, Date dateFin, int nbKmPrevisionnel, boolean reduction, Vehicule vehicule, Client client) {
    this.reduction = reduction;
    this.vehicule = vehicule;
    this.client = client;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }

   //Méthodes :

  /**
   * Calcule la majoration du prix de la location en fonction du nombre de km parcourus.
   *
   * @param   nbKM
   *          Le nombre de km que le véhicule a parcourus.
   *
   * @return  majoration du prix de la location
   */
  public static int prixKMSupplementaires(int nbKM){
    int majoration;
    if(nbKM <= 50){
      majoration = 0;
    }else{
          if(nbKM<=100){
            majoration = (nbKM - 50) * 50;
          }
          else{
               if(nbKM <= 200){
                 majoration = (nbKM - 50) * 30;
               }
               else{
                    if(nbKM <= 300){
                      majoration = (nbKM - 50) * 20;
                    }
                    else{
                      majoration = (nbKM - 50) * 10;
                    }
               }
          }
    }
    return majoration;
  }
    /**
     * Calcule le prix prévisionnel de la location
     * @return  majoration du prix de la location
     */
  public int prixPrevisionnel(){
      int prix;
      Date duree = new Date();
      duree.setTime(dateFin.getTime()-dateDebut.getTime());
      int nbJours = ((int)duree.getTime())/(86400*1000); //86400 = nb secondes en 24h...
    System.out.println("Nombre de jouuuuurs : " + nbJours);
    prix =
            ((this.vehicule.getPrixLocationParJour()) * nbJours) + (prixKMSupplementaires(nbKmPrevisionnel)/100);
      return prix;
  }

    /**
     * autorise l'accord d'une réduction si la durée de cette location est supérieure à 4j
     *
     */
  public void accordReduction(){
    Date duree = new Date();
    duree.setTime(dateFin.getTime()-dateDebut.getTime());
    if(duree.getTime()<604800000){ //604800000 = une semaine en millisecondes
      reduction = true;
    }
  }

    //Méthodes d'accès

    /**
     * indique si une réduction a été accordée pour cette location.
     * @return un booléen valant vrai si réduction a été accordée pour cette location et faux sinon
     */
  public boolean isReduction() {
    return reduction;
  }

  public void setReduction(boolean reduction) {
    this.reduction = reduction;
  }
    /**
     * renvoie le nombre de km prévisonnel
     * @return nbKmPrevisionnel
     */
  public int getNbKmPrevisionnel() {
    return nbKmPrevisionnel;
  }

  public void setNbKmPrevisionnel(int nbKmPrevisionnel) {
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }
    /**
     * renvoie la date de fin
     * @return dateFin la date de fin
     */
  public Date getDateFin() {
    return dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }
    /**
     * renvoie  la date de début
     * @return  dateDebut la date de fin
     */
  public Date getDateDebut() {
    return dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  public void setClient (Client client){
    this.client = client;
  }

  public void setVehicule(Vehicule vehicule){
    this.vehicule = vehicule;
  }

  @Override
  /**
   * affiche cette location
   */
  public String toString() {
    return "Location{" +
            "dateDebut=" + dateDebut +
            ", dateFin=" + dateFin +
            ", nbKmPrevisionnel=" + nbKmPrevisionnel +
            ", reduction=" + reduction +
            ", vehicule=" + vehicule +
            '}';
  }
}
