public class GuestUserFactory implements UserFactory {
    @Override
    public User createUser() {
        return new User.UserBuilder("guest", "guest@example.com")
                .firstName("Guest")
                .isActive(false)
                .build();
    }
}
