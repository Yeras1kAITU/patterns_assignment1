public class AdminUserFactory implements UserFactory {
    @Override
    public User createUser(String username, String email) {
        return new User.UserBuilder(username, email)
                .role("Admin")
                .isActive(true)
                .build();
    }
}
