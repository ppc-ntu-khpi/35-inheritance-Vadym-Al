package domain;

public class Animals {

    protected String name;

    protected int age;

    protected String mood;

    protected String gender;

    public Animals() {
        name="just animal";
        age=5;
        mood="good";
        gender="male";
    }

    public void rest() {
        mood="good";
        System.out.println("Resting... mood:"+mood);
    }

    public void speak() {
        System.out.println("Speaking...");
    }

    @Override
    public String toString() {
        return "Animals:" + "\nName=\t" + name + ", \nAge=\t" + age + ", \nMood=\t" + mood + ", \nGender=\t" + gender;
    }
}
