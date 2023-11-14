package org.example.accessmodifiers;

import org.example.accessmodifiers.peopleevidence.Person;

public class EvidenceCatalog {
    public static void main(String[] args) {

        Person vasilita = new Person();
        System.out.println(vasilita.isRetired);

        vasilita.isRetired = true;

        if (vasilita.isRetired) {
            System.out.println("Vasilita is retired");

        } else {
            System.out.println("Vasilita is not retired");
        }

        Person elissa = new Person(55555, "fffff", "Elissa", false);
        System.out.println("Info about elissa " + elissa.isRetired);

        if (elissa.isRetired) {
            System.out.println("Elissa is retired");

        } else {
            System.out.println("Elissa is not retired");
        }

        Person marcel = new Person(123, "Marceeel");
        System.out.println("Info about marcel " + marcel.isRetired);

        System.out.println(Person.hasHeart);

    }
}
