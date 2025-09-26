package factory;

public class Main {
    public static void main(String[] args) {
        UserFactory adminFactory = new AdminUserFactory();
        UserFactory guestFactory = new GuestUserFactory();

        User admin = adminFactory.createUser("adminUser", "admin@mail.com");
        User guest = guestFactory.createUser("guestUser", "guest@mail.com");

        System.out.println(admin);
        System.out.println(guest);
    }
}
