package test;

import domain.Leopard;
import domain.Rabbit;


/**
 * The class Test animal
 */
public class TestAnimal {


    /**
     *
     * Main
     *
     * @param args  the args
     */
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Leopard leopard = new Leopard();
        System.out.println(rabbit);
        rabbit.chew();
        System.out.println(leopard);
        leopard.hunt();
    }
}
