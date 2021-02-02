package test;

import domain.Leopard;
import domain.Rabbit;

public class TestAnimal {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Leopard leopard = new Leopard();
        System.out.println(rabbit);
        rabbit.chew();
        System.out.println(leopard);
        leopard.hunt();
    }
}
