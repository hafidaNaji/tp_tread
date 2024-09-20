import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppSommeurTp2 {
    public static void main(String[] args) {

        int nbrThread=3;//définir le nombre de thread
        SommeurTp2[] sommeurs=new SommeurTp2[nbrThread];
        int[] tableau = new int[10];// Créer un tableau d'entiers de taille 10
        // Initialiser le tableau avec des valeurs (par exemple, les nombres de 1 à 10)
        int longueur= tableau.length;
        for (int i = 0; i < longueur; i++) {
            tableau[i] = i + 1; // Cela met les valeurs 1, 2, ..., 10 dans le tableau
        }
        ExecutorService pool=Executors.newFixedThreadPool(nbrThread);

            // Diviser le tableau en plages pour chaque thread
            int taillePlage = (longueur+nbrThread-1) / nbrThread;
            for (int i = 0; i < nbrThread; i++) {
                int debut = i * taillePlage;
                int fin = Math.min(debut+taillePlage,longueur);
                sommeurs[i] = new SommeurTp2(tableau, debut, fin);
                pool.submit(sommeurs[i]);
            }

        // Arrêter le pool après exécution
        pool.shutdown();
        while(!pool.isTerminated()){
            //Attendre que tous les thread terminent
        }
        // Calculer la somme totale
        int sommeTotale = 0;
        for (SommeurTp2 sommeur : sommeurs) {
            sommeTotale += sommeur.getSomme();
        }

        // Afficher la somme totale
        System.out.println("La somme totale du tableau est : " + sommeTotale);
    }



        }

