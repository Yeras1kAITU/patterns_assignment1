public class GuestUserFactory implements UserFactory {
    @Override
    public User createUser(String username, String email) {
        return new User.UserBuilder(username, email)
                .role("Guest")
                .isActive(false)
                .build();
    }
}
