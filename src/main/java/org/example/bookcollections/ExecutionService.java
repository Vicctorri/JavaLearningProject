package org.example.bookcollections;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {

    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic Habits", "James C.");
        Book alexBook = new Book("crime and Punishment", "Feodor D.");
        Book ruxBook = new Book("Karamazov Brothers", "Feodor C.");
        Book veronicaBook = new Book("Too Kill a Mockingbird", "Harper L.");

        mihaisBook.printTheBookDetails();
        alexBook.printTheBookDetails();
        ruxBook.printTheBookDetails();
        veronicaBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicaBook);
        carturestiLibrary.addBook(ruxBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(mihaisBook));

        carturestiLibrary.deleteAbookIfExists(mihaisBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();

        Library victorLibrary = new Library("Cartier");

        victorLibrary.addBook(ruxBook);
        victorLibrary.addBook(veronicaBook);
        victorLibrary.addBook(alexBook);
        System.out.println(victorLibrary.getTheStockStatusNumber());
        victorLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("Str. Stefan cel Mare 136", carturestiLibrary);
        librariesMap.put("Str. Dacia 78", victorLibrary);

        librariesMap.get("Str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Str. Dacia 78").isThereSuchABookInTheStock(veronicaBook));

        System.out.println(librariesMap.get("Str. Stefan cel Mare 136").getLibraryName());

        int[] dateTable = new int[6];
        dateTable[0] = 65;
        dateTable[1] = 6;
        dateTable[2] = 5;
        dateTable[3] = 52;
        dateTable[4] = 625;
        dateTable[5] = 66;
        System.out.println(IntNumberArrayService.findMin(dateTable));
        System.out.println(IntNumberArrayService.getAvg(dateTable));

        int[] dataTableShort = {3, 8, 96, 7896, 74, 7};
        System.out.println(IntNumberArrayService.findMin(dataTableShort));
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));

    }
}
