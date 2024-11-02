// File: bank/Encapsulation.java
package bank;

public class Encapsulation {

    public void displayAccountDetails() {
        Account account1 = new Account();
        
        // Predefined values for demonstration
        account1.name = "customer1";
        account1.setEmail("g5j9U@example.com");
        account1.setPassword("78692");

        // Print account details
        System.out.println("Account Details from Encapsulation:");
        System.out.println("Name: " + account1.name);
        System.out.println("Email: " + account1.getEmail());
        System.out.println("Password: " + account1.getPassword());
    }
}
