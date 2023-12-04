package org.example.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile();

    }

    public static void informIfTheFileExists(File file){
        if (file.exists()){
            System.out.println("The file is present");
        } else {
            System.out.println("The file does not exist");
        }
    }

    public static void printTheFilename(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getName());
    }

    public static void printTheAbsolutePath(File theAbsolutePath){
        System.out.println(theAbsolutePath.getAbsolutePath());
    }

    public static void printIfItIsDirectoryOrFile(File file){
        if (file.isDirectory()){
            System.out.println("is directory");
        } else {
            System.out.println("is file");
        }
    }
}
