package domain;

public class Leopard extends Predator {

    private String color;

    public Leopard(String name, String color, int age, String mood, String gender) {
        this.name=name;
        this.color=color;
        this.age=age;
        this.mood=mood;
        this.gender=gender;
    }

    public Leopard() {
        this("keks","pink",7,"good","male");
    }

    public void bite() {
        System.out.println("Bite!");
    }

    @Override
    public void meat_eating() {
        super.meat_eating(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hunt() {
        super.hunt(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+"\nColor:\t"+this.color; //To change body of generated methods, choose Tools | Templates.
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
