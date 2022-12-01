package Assignment_2;

import java.util.*;

public class phonebookManager {
    private static Scanner scan = new Scanner(System.in);
    private static String choice;
    private boolean searchNode = false;
    private boolean emptyNode = true;
	private listNode startNode;
    private listNode current;

    public void add(listNode book) {
        int i = 0;
        if (startNode == null) i = 1;
        switch (i) {
            case 1:
                book.next = startNode;
                startNode = book;
                break;
            default:
                current = startNode;
                while (current.next != null) {
                    current = current.next;
                }
                book.next = current.next;
                current.next = book;
        }
    }

    public void modify(String firstName, String lastName) {
        listNode node = startNode;
        while (node != null) {
            if (node.firstName.equals(firstName) && node.lastName.equals(lastName)) {
                searchNode = true;
                break;
            }
            node = node.next;
        }
        if (searchNode) {
            System.out.println();
            System.out.println(node.toString());
            System.out.println("What would you like to change?");
            System.out.println("(1) First Name");
            System.out.println("(2) Last Name");
            System.out.println("(3) Phone Number");
            System.out.println("(4) City");
            System.out.println("(5) Address");
            System.out.print("Choose 1 - 5: ");
            choice = scan.next();
            
            switch (choice) {
                case "1":
                    System.out.print("\nFirst name: ");
                    firstName = scan.next();
                    node.firstName = firstName;
                    break;
                case "2":
                    System.out.println("\nLast name:");
                    lastName = scan.next();
                    node.lastName = lastName;
                    break;
                case "3":
                    System.out.print("\nEnter a Phone Number: ");
                    String phoneNumber = scan.next();
                    node.phoneNumber = phoneNumber;
                    break;
                case "4":
                    System.out.print("\nEnter a City: ");
                    String city = scan.next();
                    node.city = city;
                    break;
                case "5":
                    System.out.print("\nEnter an Address: ");
                    String address = scan.next();
                    node.address = address;
                    break;
                default:
                    System.out.println("Invalid entry.");
            }
        } else {
            System.out.println("Contact doesn't exist.");
        }
    }

    public void delete(String firstName, String lastName) {

    }

    public void print() {
        listNode node = startNode;
        if (node != null) {
			System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "-First-", 
            "-Last-", "-Phone-", "-City-", "-Address-");
        }
		while (node != null) {
			System.out.format("%-20s%-20s%-20s%-20s%-20s\n", node.firstName, 
            node.lastName, node.phoneNumber, node.city, node.address);
			node = node.next;
			emptyNode = false;
		}
		if (emptyNode) {
			System.out.println("No entries found.");
        }
	}
}