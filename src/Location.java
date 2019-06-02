import java.util.Calendar;
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
  private Client client;
  

   //Constructeurs

  public Location(Date dateDebut, Date dateFin, int prixPrevisionnel, int nbKmPrevisionnel) {
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.prixPrevisionnel = prixPrevisionnel;
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }

   //Méthodes :

  void accordReduction(){         //accorde une réduction si la durée de location est supérieure à 4j...
    Date duree = new Date();
    duree.setTime(dateFin.getTime()-dateDebut.getTime());
    if(duree.getTime()<604800000){
      reduction = true;
    }
  }

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

  public void setClient (Client client){
    this.client = client;
  }

  public void setVehicule(Vehicule vehicule){
    this.vehicule = vehicule;
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
