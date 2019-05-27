


 //Classe Vehicule

public class Vehicule {


   // Attributs


  private String marque;
  private String modele;
  private int prixLocationParJour;
  private int vitesseMax;
  private String etat;
  

  // Constructeurs

  public Vehicule () { };
  

   // Méthodes




 // Getteurs et setteurs et setteurs


   // remplace la valeur de par marque
  //  nouvelle : la nouvelle valeur de marque

  private void setMarque (String nouvelle) {
    marque = nouvelle;
  }

   // reçoit la valeur de marque

  private String getMarque () {
    return marque;
  }

   // remplace la valeur de par modele
  //  nouvelle : la nouvelle valeur de modele

  private void setModele (String nouvelle) {
    modele = nouvelle;
  }

   // reçoit la valeur de modele

  private String getModele () {
    return modele;
  }

   // remplace la valeur de par prixLocationParJour
  //  nouvelle : la nouvelle valeur de prixLocationParJour

  private void setPrixLocationParJour (int nouvelle) {
    prixLocationParJour = nouvelle;
  }

   // reçoit la valeur de prixLocationParJour

  private int getPrixLocationParJour () {
    return prixLocationParJour;
  }

   // remplace la valeur de par vitesseMax
  //  nouvelle : la nouvelle valeur de vitesseMax

  private void setVitesseMax (int nouvelle) {
    vitesseMax = nouvelle;
  }

   // reçoit la valeur de vitesseMax

  private int getVitesseMax () {
    return vitesseMax;
  }

   // remplace la valeur de par etat
  //  nouvelle : la nouvelle valeur de etat

  private void setEtat (String nouvelle) {
    etat = nouvelle;
  }

   // reçoit la valeur de etat

  private String getEtat () {
    return etat;
  }


   // Méthodes


}
