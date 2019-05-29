

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
  public String getNumeroTel() {
    return numeroTel;
  }

  public void setNumeroTel(String numeroTel) {
    this.numeroTel = numeroTel;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @Override
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
