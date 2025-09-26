package abstractFactory;

public interface AppUser {
    String getUsername();
    String getEmail();
    String getRole();
    String getPlatform();
    boolean isActive();

    @Override
    String toString();
}
