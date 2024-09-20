
public  class AppTalkativeTp1 {
    public static void main(String[] args) {
        // Créer 10 threads
        for (int i = 1; i < 11; i++) {

            // Création d'une nouvelle instance de Talkative avec un entier unique
            TalkativeTp1 talkative=new TalkativeTp1(i);

            // Création d'une nouvelle instance de Thread avec l'objet talkative
            Thread thread=new Thread(talkative);
            // Démarrage du thread

            thread.start();

        }

                }
                }