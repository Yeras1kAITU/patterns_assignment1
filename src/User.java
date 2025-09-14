public class User {
    private final String username;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final boolean isActive;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.isActive = builder.isActive;
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
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public static class UserBuilder {
        private final String username;
        private final String email;
        private String firstName;
        private String lastName;
        private int age;
        private String phoneNumber;
        private boolean isActive;

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

        public User build() {
            return new User(this);
        }
    }
}