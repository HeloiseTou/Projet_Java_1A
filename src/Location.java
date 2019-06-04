import java.util.Calendar;
import java.util.Date;


 //Classe Location

public class Location {


   // Attributs


  private Date dateDebut;
  private Date dateFin;
  private int nbKmPrevisionnel;
  private boolean reduction;
  private Vehicule vehicule;
  private Client client;
  

   //Constructeurs

  public Location(Date dateDebut, Date dateFin, int nbKmPrevisionnel) {
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.nbKmPrevisionnel = nbKmPrevisionnel;
  }

   //Méthodes :
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
  public int prixPrevisionnel(){
      int prix;
      Date duree = new Date();
      duree.setTime(dateFin.getTime()-dateDebut.getTime());
      int nbJours = ((int)duree.getTime())/86400; //86400 = nb secondes en 24h...
      prix = (this.vehicule.getPrixLocationParJour())*nbJours + prixKMSupplementaires(nbKmPrevisionnel);
      return prix;
  }

  public void accordReduction(){         //accorde une réduction si la durée de location est supérieure à 4j...
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
            ", nbKmPrevisionnel=" + nbKmPrevisionnel +
            ", reduction=" + reduction +
            ", vehicule=" + vehicule +
            '}';
  }
}
