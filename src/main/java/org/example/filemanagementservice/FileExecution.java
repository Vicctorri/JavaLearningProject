package org.example.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileExecution {
    public static void main(String[] args) throws IOException {

        File fileObject = new File("src/main/java/org/example/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFilename(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsDirectoryOrFile(fileObject);

        OutputFileWriter.wrieinfoIntoAFileUsingFileWriter(fileObject.getPath(), "conteeeeeent");
        OutputFileWriter.wrieinfoIntoAFileUsingFileWriter(fileObject.getPath(), "altceva");

        OutputFileWriter.writeInfoIntoAFileByUsingBufferedWriter(fileObject, "value free");
        OutputFileWriter.writeInfoIntoAFileByUsingBufferedWriter(fileObject, "value free 222");

        InputFileReader.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReader.printDataFromAFileUsingBufferReader(fileObject);
        InputFileReader.printdatausingTheEasiestWay(fileObject);


    }
}
