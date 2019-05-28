
public class Main {
    public static void main(String args[]) {
        VehiculeAerien lol = new Avion();
        lol.setNbHeureVol(1500);
        System.out.println(lol.getNbHeureVol());// faut-il plutôt mettre les attributs de la classe abstraite en "protected" (comme ça on peut quand même y accéder depuis les classes filles) ou c'est mieux de mettre en priavate et après d'utiliser les getteurs dans les classes filles pour récupérer les valeurs?
    }
}
