package org.example.zooclubservice;

public class Dog extends Animal{

    private boolean hasGoodLife;

    public Dog(String nameOfTheDog, boolean hasGoodLife){
        super(nameOfTheDog);
        this.hasGoodLife = hasGoodLife;
    }
    public Dog(String nameOfTheDog){
        super(nameOfTheDog);
    }

    @Override
    public void makeSound() {
        System.out.println("Ham-Ham");
    }


    @Override
    public void eat() {
        System.out.println("The dog is eating pidigri");
    }

    public String getName(){
        return this.name + " - This is from the child class";
    }
}
