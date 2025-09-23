public class User {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private boolean isActive;
    private String role;
    private String platform;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.isActive = builder.isActive;
        this.role = builder.role;
        this.platform = builder.platform;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isActive() {
        return isActive;
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
                ", isActive=" + isActive + '\'' +
                ", role=" + role + '\'' +
                ", platform=" + platform +
                ';';
    }

    public static class UserBuilder {
        private final String username;
        private final String email;
        private String firstName;
        private String lastName;
        private int age;
        private String phoneNumber;
        private boolean isActive;
        private String role;
        private String platform;

        public UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public UserBuilder role(String role) {
            this.role = role;
            return this;
        }

        public UserBuilder platform(String platform) {
            this.platform = platform;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
