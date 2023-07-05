
/*
*
* */
public class Main {
    public static void main(String[] args)
    {
        System.out.println(" ");
        //créer des robots
        Robot r1 = new Robot("robot cop", new NormalBehaviour());
        Robot r2 = new Robot("Big robot");

        r2.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();

        //set le comportement des robots
        r1.setBehaviour(new DefensiveBehaviour());
        r2.setBehaviour(new AgressiveBehaviour());

        //executer la méthode move()
        r2.move();

        // modifier le comportement du robot au moment de l'exécution runtime sans changer de robot


    }
}