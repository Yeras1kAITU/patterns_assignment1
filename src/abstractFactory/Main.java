package abstractFactory;

public class Main {
    public static void main(String[] args) {
        AppUserFactory webFactory = new WebAppUserFactory();
        AppUserFactory mobileFactory = new MobileAppUserFactory();

        AppUser webAdmin = webFactory.createAdmin("webAdmin", "webadmin@mail.com");
        AppUser webGuest = webFactory.createGuest("webGuest", "webguest@mail.com");

        AppUser mobileAdmin = mobileFactory.createAdmin("mobileAdmin", "mobileadmin@mail.com");
        AppUser mobileGuest = mobileFactory.createGuest("mobileGuest", "mobileguest@mail.com");

        System.out.println(webAdmin);
        System.out.println(webGuest);
        System.out.println(mobileAdmin);
        System.out.println(mobileGuest);
    }
}
