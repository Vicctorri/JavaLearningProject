package org.example.methods;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtils {

    private static Random objectOfRandomClass = new Random();

    public static int getRandom(int min, int max){

        int delta = max - min;

        if (delta<=0){
            System.out.println("The delta has to be positive");
            return 0;
        }
        int randomIntForThisDelta = objectOfRandomClass.nextInt(delta);

        return  randomIntForThisDelta+min;
    }

    public static int getRandom(int limit){
        if (limit<0){
            return 0;
        }
        return objectOfRandomClass.nextInt(limit);
    }

    static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;

    }


}
