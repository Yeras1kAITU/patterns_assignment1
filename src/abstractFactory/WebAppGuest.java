package abstractFactory;

public class WebAppGuest extends AbstractAppUser {
    public WebAppGuest(String username, String email) {
        super(username, email);
        setRole("Guest");
        setPlatform("WebApp");
    }
}

