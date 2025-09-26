package abstractFactory;

public interface AppUserFactory {
    AppUser createAdmin(String username, String email);
    AppUser createGuest(String username, String email);
}
