package example;

import java.io.File;
import java.util.Scanner;

public class SearchFile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the file name to search
        System.out.print("Enter the file name to search: ");
        String fileName = scanner.nextLine();
        
        // Prompt the user to enter the directory to search in
        System.out.print("Enter the directory to search in: ");
        String directoryPath = scanner.nextLine();
        
        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Get the list of files in the directory and its subdirectories
        File[] files = directory.listFiles();

        // Loop through the files and search for the specified file
        boolean fileFound = false;
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                System.out.println("File found: " + file.getAbsolutePath());
                fileFound = true;
            }
        }
        
        // Display a message if the file was not found
        if (!fileFound) {
            System.out.println("File not found.");
        }
    }
}