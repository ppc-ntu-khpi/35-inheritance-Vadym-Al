package domain;


/**
 * The class Rabbit extends herbivores
 */
public class Rabbit extends Herbivores {

    private String type;


    /**
     *
     * Rabbit
     *
     * @param name  the name
     * @param type  the type
     * @param age  the age
     * @param mood  the mood
     * @param gender  the gender
     * @return public
     */
    public Rabbit(String name, String type, int age, String mood, String gender) {

        this.name = name;
        this.type = type;
        this.age = age;
        this.mood = mood;
        this.gender = gender;
    }


    /**
     *
     * Rabbit
     *
     * @return public
     */
    public Rabbit() {

        this("Carrot","grey",12,"evil","female");
    }


    /**
     *
     * Chew
     *
     */
    public void chew() {

        mood = "good";
        System.out.println("Chewing... mood:"+mood);
    }

    @Override

/**
 *
 * All_eating
 *
 */
    public void all_eating() {

        super.all_eating(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * Searching leaves
 *
 */
    public void SearchingLeaves() {

        super.SearchingLeaves(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

/**
 *
 * To string
 *
 * @return String
 */
    public String toString() {

        return super.toString()+"\nType:\t"+type; //To change body of generated methods, choose Tools | Templates.
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
