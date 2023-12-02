package org.example.exceptions;

public class ArithmeticOperationService {

    public static double divideWithoutExceptionHandling(int a, int b){
        return a/b;
    }

    public static double divideWithExceptionHandling(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException captureException){
            System.out.println(captureException.getMessage());
            return 0.0;
        }
    }
}
