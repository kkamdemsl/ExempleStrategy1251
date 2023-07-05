/**
 * C'est la classe du robot se déplaçant dans la scène
 * */
public class Robot
{
    /**
     * C'est le nom du robot
     * */
    private String nom;
    /**
     * C'est le comportement du robot
     * */
    private IBehaviour behaviour;

    //constructeur avec paramètre
    public Robot(String nom) {
        this.nom = nom;
    }

    //constructeur vide ou par defaut
    public Robot()
    {
        this.nom = "sans nom";
    }

    //constructeur surchargé
    public Robot(String nom, IBehaviour behaviour)
    {
        this.nom=nom;
        this.behaviour= behaviour;
    }
    //constructeur de copie permet de construire un robot à partir d'un robot, pour ne pas avoir 2 objets qui pointent sur la même adresse
    public Robot(Robot robot)
    {
        this.nom=robot.getNom();
        this.behaviour= robot.behaviour;
    }

    //getter and setter
    public String getNom() {
        return nom;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    //methode move
    public void move()
    {
        System.out.println("Le robot "+nom+" se dépalce dans la scène.");
        this.behaviour.moveCommand();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nom='" + nom + '\'' +
                ", behaviour=" + behaviour +
                '}';
    }


}
