public class MobileAppUserFactory implements AbstractUserFactory {
    private final String username;
    private final String email;

    public MobileAppUserFactory(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User createAdmin() {
        return new User.UserBuilder(username, email)
                .role("Admin")
                .platform("Mobile")
                .isActive(true)
                .build();
    }

    public User createGuest() {
        return new User.UserBuilder(username, email)
                .role("Guest")
                .platform("Mobile")
                .isActive(false)
                .build();
    }
}
