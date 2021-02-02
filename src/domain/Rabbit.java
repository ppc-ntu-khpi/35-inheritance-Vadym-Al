package domain;

public class Rabbit extends Herbivores {

    private String type;

    public Rabbit(String name, String type, int age, String mood, String gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.mood = mood;
        this.gender = gender;
    }

    public Rabbit() {
        this("Carrot","grey",12,"evil","female");
    }

    public void chew() {
        mood = "good";
        System.out.println("Chewing... mood:"+mood);
    }

    @Override
    public void all_eating() {
        super.all_eating(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SearchingLeaves() {
        super.SearchingLeaves(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"\nType:\t"+type; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void speak() {
        super.speak(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rest() {
        super.rest(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
