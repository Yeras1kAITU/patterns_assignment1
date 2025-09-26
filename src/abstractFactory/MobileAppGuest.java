package abstractFactory;

public class MobileAppGuest extends AppUser {
    public MobileAppGuest(String username, String email) {
        super(username, email, "Guest", "MobileApp");
    }
}
