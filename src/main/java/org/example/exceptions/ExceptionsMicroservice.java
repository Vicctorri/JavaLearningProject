package org.example.exceptions;

import static org.example.exceptions.TextManager.getTheTextLengthWithTryAndCatch;

public class ExceptionsMicroservice {
    public static void main(String[] args) {

        String controlVariable = null;

        System.out.println("The string length is = " + TextManager.getTheTextLength("controlVariable"));
        System.out.println("The string length is = " + getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The string length is = " + TextManager.getTheTextLengthWithIf(controlVariable));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(0, 2));
        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(0, 0));


    }
}
