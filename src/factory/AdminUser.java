package factory;

public class AdminUser extends User {
    public AdminUser(String username, String email) {
        super(username, email, "Admin");
    }
}
