//Encapsulation :  Combining data and functions into a single unit/entity,This is unit here is Class ,and this is called Encapsulation.
//Types of Encapsulation/access modifiers: 
//1. private : cant be accessed outside the class.
//2. public  : can be accessed within the package/file/class.
//3. protected: can be accessed within the package/file/class and in the other file only sub classes can acces it-
//4. default: can be accessed within the package/file/class.

import bank.Account;

class Shape {

    // Method to display the area (demonstration method for base class)
    void area() {
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape {

    // Method to calculate the area of a triangle
    void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

public class OOP {

    public static void main(String[] args) {
        // Instantiating an Account object from the bank package
        Account account1 = new Account();
        account1.name = "customer1"; // Setting name property
        account1.setEmail("customer1@example.com"); // Using getters/setters because this a  protected property
        account1.setPassword("12345"); // Using getter/setter because its a private 

        // Display account details
        System.out.println("Account Details:");
        System.out.println("Name: " + account1.name);
        System.out.println("Email: " + account1.getEmail()); // Accessing email through getter
        System.out.println("Password: " + account1.getPassword()); // Accessing password through getter

        // Demonstrating inheritance and polymorphism
        Shape shape = new Triangle();
        shape.area(); // Calls the base class method

        Triangle triangle = new Triangle();
        triangle.area(10, 5); // Calls the Triangle-specific method
    }
}
