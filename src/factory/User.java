package factory;

public abstract class User {
    protected String username;
    protected String email;
    protected String role;

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String phoneNumber;
    protected boolean isActive;

    protected User(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.isActive = true;
    }

    @Override
    public String toString() {
        return "User: " +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +   // NEW
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ';';
    }
}
