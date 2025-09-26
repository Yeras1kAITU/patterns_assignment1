package abstractFactory;

import factory.User;

public abstract class AppUser extends User {
    public AppUser(String username, String email) {
        super(username, email);
    }
}
