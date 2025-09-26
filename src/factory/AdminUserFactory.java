package factory;

public class AdminUserFactory implements UserFactory {
    @Override
    public User createUser(String username, String email) {
        return new AdminUser(username, email);
    }
}

