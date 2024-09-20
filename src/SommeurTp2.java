public class SommeurTp2 implements Runnable{

    private int [] tableau;
    private int debut;
    private  int fin;
    private  int somme;

    public SommeurTp2(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;// Initialisation de la somme
    }

    public int getSomme() {
        return somme;
    }

    @Override
    public void run() {
        for (int i = debut; i < fin; i++) {
            somme += tableau[i];
        }
    }
}
