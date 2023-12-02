package org.example.zooclubservice;

public class ExecutionClass {
    public static void main(String[] args) {

    Animal charly = new Dog("Charly", true);
        System.out.println(charly.getName());
        charly.eat();
        charly.makeSound();

        Dog rex = new Dog("Rex", false);
        System.out.println(rex.getName());

        Cat bonny = new Cat("Bonny");
        bonny.eat();
        bonny.makeSound();

    }
}
