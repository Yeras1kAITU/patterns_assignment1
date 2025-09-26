package abstractFactory;

public class WebAppAdmin extends AbstractAppUser {
    public WebAppAdmin(String username, String email) {
        super(username, email);
        setRole("Admin");
        setPlatform("WebApp");
    }
}

