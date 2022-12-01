package Assignment_2;

public class listNode {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String city;
    public String address;
    public listNode next;
    
    public listNode(String newFirstName, String newLastName, String newPhoneNumber, 
                    String newCity, String newAddress) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.phoneNumber = newPhoneNumber;
        this.city = newCity;
        this.address = newAddress;
        this.next = null;
    }
    
    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + 
        lastName + ", Phone Number: " + phoneNumber + ", City: " + 
        city + ", Address: " + address;
        
    }
}