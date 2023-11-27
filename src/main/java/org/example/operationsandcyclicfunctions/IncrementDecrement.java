package org.example.operationsandcyclicfunctions;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 69;
        int b = 34;

        System.out.println(++a);
        System.out.println(a);

        System.out.println(++b);

        a = a + 1;
        System.out.println(a);
        System.out.println(a = a - 1);
        System.out.println(a);
    }
}
