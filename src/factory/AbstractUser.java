package factory;

public abstract class AbstractUser implements User {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private boolean isActive;
    private String role;
    private String platform;

    public AbstractUser(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // --- Getters ---
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public boolean isActive() { return isActive; }
    public String getRole() { return role; }
    public String getPlatform() { return platform; }

    // --- Setters ---
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setActive(boolean active) { isActive = active; }

    // --- Role & Platform (только наследники/фабрики используют) ---
    protected void setRole(String role) { this.role = role; }
    protected void setPlatform(String platform) { this.platform = platform; }

    @Override
    public String toString() {
        return "User: " +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ", role='" + role + '\'' +
                ", platform='" + platform + '\'';
    }
}
