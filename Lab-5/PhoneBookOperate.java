import java.util.*;

public class PhoneBookOperate {

    LinkedList<PhoneData> phoneBook = new LinkedList<PhoneData>();

    // Method to add a new entry to the phone book
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstname = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastname = input.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNum = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter city: ");
        String city = input.nextLine();
        System.out.print("Enter state: ");
        String state = input.nextLine();
        System.out.print("Enter zip code: ");
        String zip = input.nextLine();
        PhoneData data = new PhoneData(firstname, lastname, phoneNum, address, city, state, zip);
        phoneBook.add(data); // Adds new entry to the list
    }

    // Method to delete an entry from the phone book
    public void delete() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phoneNum = input.nextLine();
        Iterator<PhoneData> iterator = phoneBook.iterator();
        while (iterator.hasNext()) {
            PhoneData data = iterator.next();
            if (data.getPhoneNum().equals(phoneNum)) {
                iterator.remove(); // Removes the entry if phone number matches
            }
        }
    }

    // Method to edit an existing entry in the phone book
    public void edit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phoneNum = input.nextLine();
        Iterator<PhoneData> iterator = phoneBook.iterator();
        while (iterator.hasNext()) {
            PhoneData data = iterator.next();
            if (data.getPhoneNum().equals(phoneNum)) {
                // Prompt user for new details
                System.out.print("Enter new First Name: ");
                String firstname = input.nextLine();
                System.out.print("Enter new Last Name: ");
                String lastname = input.nextLine();
                System.out.print("Enter new phone number: ");
                String newPhoneNum = input.nextLine();
                System.out.print("Enter new address: ");
                String address = input.nextLine();
                System.out.print("Enter new city: ");
                String city = input.nextLine();
                System.out.print("Enter new state: ");
                String state = input.nextLine();
                System.out.print("Enter new zip code: ");
                String zip = input.nextLine();
                
                // Updating the existing phone data
                data.setFirstName(firstname);
                data.setLastName(lastname);
                data.setPhoneNum(newPhoneNum);
                data.setAddress(address);
                data.setCity(city);
                data.setState(state);
                data.setZip(zip);
            }
        }
    }

    // Method to list all entries in the phone book
    public void list() {
        Iterator<PhoneData> iterator = phoneBook.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Print each entry
        }
    }
}
