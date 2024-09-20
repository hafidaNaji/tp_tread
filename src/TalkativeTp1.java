public class TalkativeTp1 implements Runnable {

    private int value;

    // Constructeur prenant un entier en paramètre
    public TalkativeTp1(int value) {
        this.value = value;
    }


    // Implémentation de la méthode run de l'interface Runnable
    @Override
    public void run() {
        // Afficher 100 fois la valeur de l'attribut value
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + value + " - Value : " + i);
        }

    }

}
