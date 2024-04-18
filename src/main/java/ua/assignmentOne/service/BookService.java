package ua.assignmentOne.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static List<String> filesProcessing(String filePath) {
        System.out.println(filePath);

        List<String> fileNames = new ArrayList<>();
        File folder = new File(filePath);
        File[] files = folder.listFiles();
        try {
            for (File file: files){
                if(file.isFile()) {
                    fileNames.add(file.getAbsolutePath());
                } else {
                    System.err.println("File don`t exist");
                }
            }
        }catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
            return null;
        }
        return fileNames;
    }
}
