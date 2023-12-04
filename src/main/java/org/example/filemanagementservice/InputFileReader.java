package org.example.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReader {

    public static void printDataOnTheConsoleUsingFileReader(File file){
        FileReader fileReaderObject = null;

        try {
            fileReaderObject = new FileReader(file);

            int charnumberInAsciiSystem;
            while ((charnumberInAsciiSystem = fileReaderObject.read()) != -1){
                System.out.print((char) charnumberInAsciiSystem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("the file was not file, procedure aborted");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("there is a problem with read process");
        } finally {
            try {
                fileReaderObject.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void printDataFromAFileUsingBufferReader(File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("exceptions has occured, skip the reading");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void printdatausingTheEasiestWay(File file){
        try {
            String content = Files.readString(file.toPath());
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
