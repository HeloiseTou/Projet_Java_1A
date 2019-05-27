import java.util.Date;


 //Classe Location

public class Location {


   // Attributs


  private Date dateDebut;
  private Date dateFin;
  private int prixPrevisionnel;
  private int nbKmPrevisionnel;
  private boolean reduction;
  

   //Constructeurs

  public Location(Date dateDebut, Date dateFin, int prixPrevisionnel, int nbKmPrevisionnel, boolean reduction) {
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
    this.prixPrevisionnel = prixPrevisionnel;
    this.nbKmPrevisionnel = nbKmPrevisionnel;
    this.reduction = reduction;
  }


   //Méthodes :


    //Méthodes d'accès


   // remplace la valeur de dateDebut par nouvelle
  //  nouvelle : la nouvelle valeur de dateDebut

  private void setDateDebut (Date nouvelle) {
    dateDebut = nouvelle;
  }

   // reçoit la valeur de dateDebut

  private Date getDateDebut () {
    return dateDebut;
  }

   // remplace la valeur de par dateFin
  //  nouvelle : la nouvelle valeur de dateFin

  private void setDateFin (Date nouvelle) {
    dateFin = nouvelle;
  }

   // reçoit la valeur de dateFin

  private Date getDateFin () {
    return dateFin;
  }

   // remplace la valeur de par prixPrevisionnel
  //  nouvelle : la nouvelle valeur de prixPrevisionnel

  private void setPrixPrevisionnel (int nouvelle) {
    prixPrevisionnel = nouvelle;
  }

   // reçoit la valeur de prixPrevisionnel
  private int getPrixPrevisionnel () {
    return prixPrevisionnel;
  }

   // remplace la valeur de par nbKmPrevisionnel
  //  nouvelle : la nouvelle valeur de nbKmPrevisionnel

  private void setNbKmPrevisionnel (int nouvelle) {
    nbKmPrevisionnel = nouvelle;
  }

   // reçoit la valeur de nbKmPrevisionnel

  private int getNbKmPrevisionnel () {
    return nbKmPrevisionnel;
  }

   // remplace la valeur de par reduction
  //  nouvelle : la nouvelle valeur de reduction

  private void setReduction (boolean nouvelle) {
    reduction = nouvelle;
  }

   // reçoit la valeur de reduction

  private boolean getReduction () {
    return reduction;
  }



}
