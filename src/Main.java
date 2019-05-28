
public class Main {
    public static void main(String args[]) {
        Vehicule lol = new Avion();
        Avion av = (Avion) lol;
        av.setNbHeureVol(1500);
        System.out.println(lol.toString());// faut-il plutôt mettre les attributs de la classe abstraite en "protected" (comme ça on peut quand même y accéder depuis les classes filles) ou c'est mieux de mettre en priavate et après d'utiliser les getteurs dans les classes filles pour récupérer les valeurs?
    }
}
