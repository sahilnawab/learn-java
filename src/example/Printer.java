package example;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
class B{
	Scanner scan = new Scanner (System.in);
	File directory= new File()
	private static void searchFile() {
        System.out.println("Enter the file name:");
        String fileName = scan.nextLine();
        File file = new File(directory, fileName);
        if (file.exists()) {
            System.out.println("File found.");
        } else {
            System.out.println("File not found.");
        }
    }