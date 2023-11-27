package org.example.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 7;
        int max = 25;

        // Numbers %2 == 0
        for (int i = min; i <= max; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //Numbers %2 != 0 OR %2 == 1
        int i = min;
        while (i < max){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
            //i += 1;
            //i = i + 1;
        }

        int b = max;
        do {
            if (b % 2 == 1){
                System.out.println(b);
            }
            b--;
        } while (b >= min);
    }
}
