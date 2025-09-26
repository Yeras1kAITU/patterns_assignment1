package abstractFactory;

public class WebAppUserFactory implements AppUserFactory {
    @Override
    public AppUser createAdmin(String username, String email) {
        return new WebAppAdmin(username, email);
    }

    @Override
    public AppUser createGuest(String username, String email) {
        return new WebAppGuest(username, email);
    }
}


