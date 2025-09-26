package factory;

public class GuestUserFactory implements UserFactory {
    @Override
    public User createUser(String username, String email) {
        return new GuestUser(username, email);
    }
}
