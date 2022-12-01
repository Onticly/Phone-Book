//Aaron Tripp and Jack Pate

package Assignment_2;

import java.util.*;

public class TestClass {
    static phonebookManager Manager = new phonebookManager();
    private static Scanner scan = new Scanner(System.in);
    private static String choice;
    private static boolean end = false;

    public static void main(String[] args) {

        while(end == false) {
            System.out.println();
            System.out.println("(a) Add new contact");
            System.out.println("(m) Modify a contact");
            System.out.println("(d) Delete a contact");
            System.out.println("(p) Print contacts list");
            System.out.println("(q) Exit");
            System.out.print("Select an option: ");
            choice = scan.next();

            switch (choice) {
                case "a":
                    System.out.print("\nEnter the First name: ");
                    String firstName = scan.next();
                    System.out.print("\nEnter the Last name: ");
                    String lastName = scan.next();
                    System.out.print("\nEnter a Phone Number: ");
                    String phoneNumber = scan.next();
                    System.out.print("\nEnter a City: ");
                    String city = scan.next();
                    System.out.print("\nEnter an Address: ");
                    String address = scan.next();
                    listNode book = new listNode(firstName, lastName, 
                    phoneNumber, city, address);
                    Manager.add(book); 
                    break;
                case "m":
                    System.out.println("Enter a contact to modify");
                    System.out.print("\nEnter the First name: ");
                    firstName = scan.next();
                    System.out.print("\nEnter the Last name: ");
                    lastName = scan.next();
                    Manager.modify(firstName, lastName);
                    break;
                case "d":
                    System.out.println("Enter a contact you'd like to delete: ");
                    System.out.print("\nEnter the First name: ");
                    firstName = scan.next();
                    System.out.print("\nEnter the Last name: ");
                    lastName = scan.next();
                    Manager.delete(firstName, lastName);
                    break;
                case "p":
                    System.out.println(); 
					System.out.println("Current contact list:");
					Manager.print();
					break; 
                case "q": 
                    System.out.println("Exiting Phone Book . . .");
                    end = true;
                    break;
                default: 
                    System.out.println("Invalid entry");
                    break;
            }
        }
    }

}
