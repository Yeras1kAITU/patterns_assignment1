package abstractFactory;

public class Main {
    public static void main(String[] args) {
        AppUserFactory webAppUserFactory = new WebAppUserFactory();
        AppUser charlie_webAppAdminUser = webAppUserFactory.createAdmin("charlie", "charlie@mail.com");
        AppUser diana_webAppGuestUser = webAppUserFactory.createGuest("diana", "diana@mail.com");

        AppUserFactory mobileAppUserFactory = new MobileAppUserFactory();
        AppUser eve_mobileAppAdminUser = mobileAppUserFactory.createAdmin("eve", "eve@mail.com");
        AppUser frank_mobileAppGuestUser = mobileAppUserFactory.createGuest("frank", "frank@mail.com");

        System.out.println(charlie_webAppAdminUser);
        System.out.println(diana_webAppGuestUser);
        System.out.println(eve_mobileAppAdminUser);
        System.out.println(frank_mobileAppGuestUser);
    }
}

