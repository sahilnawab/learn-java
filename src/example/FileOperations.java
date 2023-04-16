package example;
import java.io.File;
import java.util.Scanner;

public class FileOperations {
    private static Scanner scan = new Scanner(System.in);
    private static File directory = new File("files");

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search for a file");
            System.out.println("4. Return to main context");
            System.out.println("5. Exit");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addFile();
                    break;
                case 2:
                    deleteFile();
                    break;
                case 3:
                    searchFile();
                    break;
                case 4:
                    returnToMainContext();
                    break;
                case 5:
                    closeApplication();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addFile() {
        System.out.println("Enter the file name:");
        String fileName = scan.nextLine();
        File file = new File(directory, fileName);
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File added successfully.");
                } else {
                    System.out.println("Error adding file.");
                }
            } catch (Exception e) {
                System.out.println("Error adding file.");
                e.printStackTrace();
            }
        }
    }

    private static void deleteFile() {
        System.out.println("Enter the file name:");
        String fileName = scan.nextLine();
        File file = new File(directory, fileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
        } else {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Error deleting file.");
            }
        }
    }

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

    private static void returnToMainContext() {
        System.out.println("Returning to main context...");
    }

    private static void closeApplication() {
        System.out.println("Closing application...");
    }
}