package factory;

public class AdminUser extends AbstractUser {
    public AdminUser(String username, String email) {
        super(username, email);
        setRole("Admin");
    }
}


