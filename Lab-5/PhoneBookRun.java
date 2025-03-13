import java.util.*;

public class PhoneBookRun {
    
    public static void main(String[] args) {
        menu(); // Calls the menu method
    }

    // Displays menu and handles user choices
    public static void menu() {
        Scanner input = new Scanner(System.in);
        PhoneBookOperate newPhoneBook = new PhoneBookOperate();
        String choice;
        
        do {   
            System.out.println("Enter A to add an entry");
            System.out.println("Enter E to edit an entry");
            System.out.println("Enter D to delete an entry");
            System.out.println("Enter L to list all entries");
            System.out.println("Enter Q to quit");
            System.out.print("Enter your choice: ");
            choice = input.next();

            // Handle user choice
            if (choice.equals("A")) {
                newPhoneBook.add();
            } else if (choice.equals("E")) {
                newPhoneBook.edit();
            } else if (choice.equals("D")) {
                newPhoneBook.delete();
            } else if (choice.equals("L")) {
                newPhoneBook.list();
            } else if (choice.equals("Q")) {
                return; // Exit the program
            } else {
                System.out.println("Invalid choice.");
            }
        } while (!choice.equals("Q"));
    }
}
