package factory;

public class GuestUser extends User {
    public GuestUser(String username, String email) {
        super(username, email, "Guest");
    }
}
