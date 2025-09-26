package abstractFactory;

public class MobileAppGuest extends AbstractAppUser {
    public MobileAppGuest(String username, String email) {
        super(username, email);
        setRole("Guest");
        setPlatform("MobileApp");
    }
}

