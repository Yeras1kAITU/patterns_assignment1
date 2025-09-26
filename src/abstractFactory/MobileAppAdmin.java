package abstractFactory;

public class MobileAppAdmin extends AbstractAppUser {
    public MobileAppAdmin(String username, String email) {
        super(username, email);
        setRole("Admin");
        setPlatform("MobileApp");
    }
}

