package factory;

public class GuestUser extends AbstractUser {
    public GuestUser(String username, String email) {
        super(username, email);
        setRole("Guest");
    }
}

