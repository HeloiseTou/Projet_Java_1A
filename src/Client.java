

Classe  Client

public class Client {

  private String nom;
  private String prenom;
  private int age;
  private String adresse;
  private String numeroTel;

  // Constructeurs

  public Client(String nom, String prenom, int age, String adresse, String numeroTel) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.adresse = adresse;
    this.numeroTel = numeroTel;
  }


   //Méthodes d'accès :

    //Set the value of nom
  private void setNom (String nouvelle) {
    nom = nouvelle;
  }

    //Get the value of nom
     return the value of nom
  private String getNom () {
    return nom;
  }

    //Set the value of prenom
    //param nouvelle the new value of prenom
  private void setPrenom (String nouvelle) {
    prenom = nouvelle;
  }

    //Get the value of prenom
     //return the value of prenom
  private String getPrenom () {
    return prenom;
  }

  //Set the value of age
  //param nouvelle the new value of age
  private void setAge (int nouvelle) {
    age = nouvelle;
  }

  Get the value of age
  return the value of age
  private int getAge () {
    return age;
  }

  //Set the value of adresse
  //param nouvelle the new value of adresse
  private void setAdresse (String nouvelle) {
    adresse = nouvelle;
  }

  //Get the value of adresse
  //return the value of adresse
  private String getAdresse () {
    return adresse;
  }

  //Set the value of numeroTel
  //param nouvelle the new value of numeroTel
  private void setNumeroTel (String nouvelle) {
    numeroTel = nouvelle;
  }

  //Récupère le numéro de téléphone numeroTel
  //Renvoie le numéro de téléphone numeroTel
  private String getNumeroTel () {
    return numeroTel;
  }


}
