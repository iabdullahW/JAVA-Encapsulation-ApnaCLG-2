package bank;

public class Encapsulation {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "customer1";
        account1.email = "g5j9U@example.com";

        // Setting and getting the password via encapsulated methods
        account1.setEmail("g5j9U@example.com");
        account1.setEmail("g5j9U@examplcom");

        System.out.println("Account email: " + account1.getEmail());
        account1.setPassword("78692");
        System.out.println("Account password: " + account1.getPassword());
    }
}
