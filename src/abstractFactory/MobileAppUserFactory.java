package abstractFactory;

public class MobileAppUserFactory implements AppUserFactory {
    @Override
    public AppUser createAdmin(String username, String email) {
        return new MobileAppAdmin(username, email);
    }

    @Override
    public AppUser createGuest(String username, String email) {
        return new MobileAppGuest(username, email);
    }
}
