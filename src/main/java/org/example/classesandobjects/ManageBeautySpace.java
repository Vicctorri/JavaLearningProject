package org.example.classesandobjects;

import org.example.classesandobjects.beatyspace.Building;
import org.example.classesandobjects.beatyspace.Client;
import org.example.classesandobjects.beatyspace.Service;
import org.example.classesandobjects.beatyspace.Specialist;

public class ManageBeautySpace {
    public static void main(String[] args) {
        Building dariaRoom;
        dariaRoom = new Building();

        dariaRoom.address = "Stefan cel Mare 64";
        dariaRoom.surfaceM3 = 259.0F;
        dariaRoom.capacity = 55;

        System.out.println("1. Object dariaRoom has fallowing characteristics: " + dariaRoom.address +
                " " + dariaRoom.surfaceM3 + " " + dariaRoom.capacity);

        Building anaCiorici = new Building();

        System.out.println("2. Object anaCiorici has fallowing characteristics: " + dariaRoom.address +
                " " + anaCiorici.surfaceM3 + " " + anaCiorici.capacity);

        Specialist angelika = new Specialist();

        angelika.name = "Angelika";
        angelika.age = 54;

        System.out.println("3. Obiectul " + angelika.name + " are " + angelika.age);

        Specialist vasilita = new Specialist();

        Client getaClient1 = new Client("869556565656565656");

        Service makeup = new Service("ddddd", "vasilitaaaaaa", getaClient1);
        Service brow = new Service("fghjg", "margo",
                new Client("newphoneertyuuy333333333333fdfgfcd"));


        System.out.println("Specialist for makeup is: " + makeup.specialist+ " and client has the phone " + makeup.client.phoneNumer);
        System.out.println("Specialist for brow is: " + brow.specialist+ " and client has the phone " + brow.client.phoneNumer);

        Client margoClient2 = new Client();

        System.out.println("Phone number received from the constructor " + margoClient2.phoneNumer);
    }
}
