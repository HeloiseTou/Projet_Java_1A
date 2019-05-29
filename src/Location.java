import java.util.Date;


 //Classe Location

public class Location {


   // Attributs


  private Date dateDebut;
  private Date dateFin;
  private int prixPrevisionnel;
  private int nbKmPrevisionnel;
  private boolean reduction;
  private Vehicule vehicule;
  

   //Constructeurs

  public Location(Date dateDebut, Date dateFin, int prixPrevisionnel, int nbKmPrevisionnel) {
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.prixPrevisionnel = prixPrevisionnel;
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }

   //Méthodes :
/*
  void accordReduction(){         //accorde une réduction si la durée de location est supérieure à 4j...
    Date duree;
    duree = différence des deux dates en nb de jours... //////////////////////////////////////////////////trouver comment faire différence entre deux dates...
    if(duree>7){
      reduction = true;
    }
  }*/

    //Méthodes d'accès


  public boolean isReduction() {
    return reduction;
  }

  public void setReduction(boolean reduction) {
    this.reduction = reduction;
  }

  public int getNbKmPrevisionnel() {
    return nbKmPrevisionnel;
  }

  public void setNbKmPrevisionnel(int nbKmPrevisionnel) {
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }

  public int getPrixPrevisionnel() {
    return prixPrevisionnel;
  }

  public void setPrixPrevisionnel(int prixPrevisionnel) {
    this.prixPrevisionnel = prixPrevisionnel;
  }

  public Date getDateFin() {
    return dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }

  public Date getDateDebut() {
    return dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  @Override
  public String toString() {
    return "Location{" +
            "dateDebut=" + dateDebut +
            ", dateFin=" + dateFin +
            ", prixPrevisionnel=" + prixPrevisionnel +
            ", nbKmPrevisionnel=" + nbKmPrevisionnel +
            ", reduction=" + reduction +
            ", vehicule=" + vehicule +
            '}';
  }
}
