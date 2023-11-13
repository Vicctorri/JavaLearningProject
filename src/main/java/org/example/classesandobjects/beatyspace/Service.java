package org.example.classesandobjects.beatyspace;

public class Service {

    public String code;

    public String specialist;
    public Client client;

    public Service(String code1, String specialist, Client client){
        code = code1;
        this.specialist = specialist;
        this.client = client;

        System.out.println("Now there is a client to specialist " + specialist);
    }

}
