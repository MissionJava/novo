package info.androidhive.firebase;

public class User {

    public String name;
    public String email;
    public String balance;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email, String balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
}
