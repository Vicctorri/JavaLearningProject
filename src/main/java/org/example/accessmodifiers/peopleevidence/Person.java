package org.example.accessmodifiers.peopleevidence;

public class Person {

    //Class variable
    public static boolean hasHeart = true;
    //Private - Instance variable because it defines the objects of the Person class
    private long idnp;

    //Default - Instance variable
    String maritalStatus;

    //Protected - Instance variable
    protected String name;

    //Public - Instance variable
    public boolean isRetired;

    public Person(){
        System.out.println("This is defined constructor without params");
    }

    public Person(long idnp, String name){
        this.idnp = idnp;
        this.name = name;
        System.out.println("This is defined constructor with two params");

    }

    public Person(long idnp, String maritalStatus, String name, boolean isRetired){
        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;
        System.out.println("This is a defined constructor with all params");

    }
}
