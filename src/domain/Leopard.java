package domain;


/**
 * The class Leopard extends predator
 */
public class Leopard extends Predator {

    private String color;


    /**
     *
     * Leopard
     *
     * @param name  the name
     * @param color  the color
     * @param age  the age
     * @param mood  the mood
     * @param gender  the gender
     * @return public
     */
    public Leopard(String name, String color, int age, String mood, String gender) {

        this.name=name;
        this.color=color;
        this.age=age;
        this.mood=mood;
        this.gender=gender;
    }


    /**
     *
     * Leopard
     *
     * @return public
     */
    public Leopard() {

        this("keks","pink",7,"good","male");
    }


    /**
     *
     * Bite
     *
     */
    public void bite() {

        System.out.println("Bite!");
    }

    @Override

/**
 *
 * Meat_eating
 *
 */
    public void meat_eating() {

        super.meat_eating(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * Hunt
 *
 */
    public void hunt() {

        super.hunt(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * To string
 *
 * @return String
 */
    public String toString() {

        return super.toString()+"\nColor:\t"+this.color; //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * Speak
 *
 */
    public void speak() {

        super.speak(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * Rest
 *
 */
    public void rest() {

        super.rest(); //To change body of generated methods, choose Tools | Templates.
    }

}
