package factory;

public abstract class User {
    protected String username;
    protected String email;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String phoneNumber;
    protected boolean isActive;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.isActive = true;
    }

    @Override
    public String toString() {
        return "User: " +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive + ';';
    }
}
