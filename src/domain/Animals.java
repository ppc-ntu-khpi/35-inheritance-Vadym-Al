package domain;


/**
 * The class Animals
 */
public class Animals {

    protected String name;

    protected int age;

    protected String mood;

    protected String gender;


    /**
     *
     * It is a constructor.
     *
     */
    public Animals() {

        name="just animal";
        age=5;
        mood="good";
        gender="male";
    }


    /**
     *
     * Rest
     *
     */
    public void rest() {

        mood="good";
        System.out.println("Resting... mood:"+mood);
    }


    /**
     *
     * Speak
     *
     */
    public void speak() {

        System.out.println("Speaking...");
    }

    @Override

/**
 *
 * To string
 *
 * @return String
 */
    public String toString() {

        return "Animals:" + "\nName=\t" + name + ", \nAge=\t" + age + ", \nMood=\t" + mood + ", \nGender=\t" + gender;
    }
}
