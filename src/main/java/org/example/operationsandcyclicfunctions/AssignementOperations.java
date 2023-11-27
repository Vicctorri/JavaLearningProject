package org.example.operationsandcyclicfunctions;

public class AssignementOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        // b %= a;
        System.out.println(b);

        a %= b;
        //a = a % b; a = 11 % 4;
        System.out.println(a);

        a += 4;
        System.out.println(a);

        //Calculate the sum of the numbers till x

        int x = 150;
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += i;
        }
        System.out.println(sum);


        int c = 45;
        int d = 5;

        c/=d;

        System.out.println(c);
    }
}
