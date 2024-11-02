//Encapsulation :  Combining data and functions into a single unit/entity,This is unit here is Class ,and this is called Encapsulation.
//Types of Encapsulation/access modifiers: 
//1. private : cant be accessed outside the class.
//2. public  : can be accessed within the package/file/class.
//3. protected: can be accessed within the package/file/class and in the other file only sub classes can acces it-
//4. default: can be accessed within the package/file/class.
package bank;

// making it public so it is accessible outside the package like "bank.Account"
public class Account {

    public String name;              // Public access modifier
    protected String email;         // Protected access modifier
    private String password;        // Private access modifier

    // Getters and setters for email and password
    //Email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Password
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
