// Sunny Zaheri - CS145 Final Project (Version B)
// This version of the BST program allows you to manage club members by ID
// You can register, delete, look up, and list members in different tree orders

import java.util.Scanner;

public class TreeMemberManager {
    public static void main(String[] args) {
        MemberTree tree = new MemberTree();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ MEMBER DIRECTORY ------");
            System.out.println("1. Register New Member");
            System.out.println("2. Delete Member");
            System.out.println("3. Look Up Member");
            System.out.println("4. Show Members (In-Order)");
            System.out.println("5. Show Members (Pre-Order)");
            System.out.println("6. Show Members (Post-Order)");
            System.out.println("7. Quit");
            System.out.print("Your choice: ");

            int option = input.nextInt();
            input.nextLine(); // Consume leftover newline

            switch (option) {
                case 1:
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("First Name: ");
                    String fname = input.nextLine();
                    System.out.print("Last Name: ");
                    String lname = input.nextLine();
                    System.out.print("Address: ");
                    String addr = input.nextLine();
                    System.out.print("City: ");
                    String city = input.nextLine();

                    tree.insert(new ClubMember(id, fname, lname, addr, city));
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    int removeId = input.nextInt();
                    tree.remove(removeId);
                    break;
                case 3:
                    System.out.print("Enter ID to look up: ");
                    int searchId = input.nextInt();
                    ClubMember result = tree.find(searchId);
                    System.out.println(result != null ? result : "Member not found.");
                    break;
                case 4:
                    System.out.println("-- In-Order --");
                    tree.printInOrder();
                    break;
                case 5:
                    System.out.println("-- Pre-Order --");
                    tree.printPreOrder();
                    break;
                case 6:
                    System.out.println("-- Post-Order --");
                    tree.printPostOrder();
                    break;
                case 7:
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid selection.");
            }
        }
    }
}

