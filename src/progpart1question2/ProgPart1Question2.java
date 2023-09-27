/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progpart1question2;


import java.util.Scanner;

public class ProgPart1Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        while (true) {
            displayMainMenu();

            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    addBookToLibrary(scanner, library);
                    break;

                case 2:
                    addDVDToLibrary(scanner, library);
                    break;

                case 3:
                    library.listItems();
                    break;

                case 4:
                    exitLibrary(scanner);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Displays the main menu options.
    private static void displayMainMenu() {
        System.out.println("Library Management System");
        System.out.println("*********************************************");
        System.out.println("1. Add Book");
        System.out.println("2. Add DVD");
        System.out.println("3. List All Items");
        System.out.println("4. Exit");
        System.out.println("*********************************************");
        System.out.print("Enter your choice: ");
    }

    // Gets the user's choice from the console.
    private static int getUserChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 1 || choice > 4) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a valid choice (1-4).");
                scanner.nextLine(); // consume the invalid input
            }
        }
        return choice;
    }

    // Adds a book to the library.
    private static void addBookToLibrary(Scanner scanner, Library library) {
        System.out.println("*********************************************");
        System.out.print("Enter Book Title: ");
        
        String bookTitle = scanner.nextLine();
        System.out.println("*********************************************");
        System.out.print("Enter Author: ");
        
        String author = scanner.nextLine();
        int year = getValidYear(scanner);
        System.out.println("*********************************************");
        System.out.print("Enter Genre: ");
       
        String genre = scanner.nextLine();
        library.addItem(new Book(bookTitle, author, year, genre));
        System.out.println("*********************************************");
        System.out.println("Book added to the library.");
    }

    // Adds a DVD to the library.
    private static void addDVDToLibrary(Scanner scanner, Library library) {
        System.out.println("*********************************************");
        System.out.print("Enter DVD Title: ");
        
        String dvdTitle = scanner.nextLine();
        System.out.println("*********************************************");
        System.out.print("Enter Director: ");
        
        String director = scanner.nextLine();
        int year = getValidYear(scanner);
        library.addItem(new DVD(dvdTitle, director, year));
        System.out.println("*********************************************");
        System.out.println("DVD added to the library.");
    }

    // Gets a valid year from the user.
    private static int getValidYear(Scanner scanner) {
        int year = 0;
        while (year <= 0) {
            System.out.print("Enter Year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (year <= 0) {
                    System.out.println("Year must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Year must be a positive number.");
                scanner.nextLine(); // consume the invalid input
            }
        }
        return year;
    }

    // Exits the library management system.
    private static void exitLibrary(Scanner scanner) {
        System.out.println("Exiting Library Management System");
        scanner.close();
        System.exit(0);
    }
}