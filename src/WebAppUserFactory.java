public class WebAppUserFactory implements AbstractUserFactory {
    private final String username;
    private final String email;

    public WebAppUserFactory(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User createAdmin() {
        return new User.UserBuilder(username, email)
                .role("Admin")
                .platform("Web")
                .isActive(true)
                .build();
    }

    public User createGuest() {
        return new User.UserBuilder(username, email)
                .role("Guest")
                .platform("Web")
                .isActive(false)
                .build();
    }
}
