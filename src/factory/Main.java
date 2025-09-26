package factory;

public class Main {
    public static void main(String[] args) {
        UserFactory adminFactory = new AdminUserFactory();
        UserFactory guestFactory = new GuestUserFactory();

        User oleg_admin = adminFactory.createUser("OlegAdmin", "admin@mail.com");
        User aiganym_guest = guestFactory.createUser("AiganymGuest", "guest@mail.com");

        System.out.println(oleg_admin);
        System.out.println(aiganym_guest);
    }
}
