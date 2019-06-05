

//Classe  Client

public class Client {

  private String nom;
  private String prenom;
  private int age;
  private String adresse;
  private String numeroTel;
  //private Location location;

  // Constructeurs

  public Client(String nom, String prenom, int age, String adresse, String numeroTel) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.adresse = adresse;
    this.numeroTel = numeroTel;
  }

  //Méthodes



   //Méthodes d'accès :


/*  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
*/
/**
     * renvoie  le numéro de téléphone de ce Cient
     * @return  numerTel le numéro de téléphone de ce Cient
     */
  public String getNumeroTel() {
    return numeroTel;
  }

  public void setNumeroTel(String numeroTel) {
    this.numeroTel = numeroTel;
  }
/**
     * renvoie  l'adresse de ce client
     * @return  adresse l'adresse de ce client
     */
  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }
/**
     * renvoie  l'âge de ce client
     * @return  age l'âge de ce client
     */
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
/**
     * renvoie  le prénom de ce client
     * @return  prenom le prénom de ce client
     */
  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
/**
     * renvoie  le nom de ce client
     * @return  nom  le nom de ce client
     */
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @Override
  /**
   * affiche ce client
   */
  public String toString() {
    return "Client{" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", age=" + age +
            ", adresse='" + adresse + '\'' +
            ", numeroTel='" + numeroTel + '\'' +
            '}';
  }
}
