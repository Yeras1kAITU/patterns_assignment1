package abstractFactory;

public abstract class AppUser {
    protected String username;
    protected String email;
    protected String role;  
    protected String platform;

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String phoneNumber;
    protected boolean isActive;

    protected AppUser(String username, String email, String role, String platform) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.platform = platform;
        this.isActive = true;
    }

    @Override
    public String toString() {
        return "AppUser: " +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +          // NEW
                ", platform='" + platform + '\'' +  // NEW
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ';';
    }
}

