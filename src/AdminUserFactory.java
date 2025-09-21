public class AdminUserFactory implements UserFactory {
    @Override
    public User createUser() {
        return new User.UserBuilder("admin", "admin@example.com")
                .firstName("System")
                .lastName("Administrator")
                .isActive(true)
                .build();
    }
}
