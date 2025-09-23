public class Main {
    public static void main(String[] args) {

        UserFactory adminFactory = new AdminUserFactory();
        UserFactory guestFactory = new GuestUserFactory();

        User oleg_sysadmin = adminFactory.createUser("sysadmin_oleg", "olegadmin@myapp.com");
        User zhalgas_guest = guestFactory.createUser("zhalgas_user", "zhalgas123@site.com");

        System.out.println("Factory Method results:");
        System.out.println(oleg_sysadmin);
        System.out.println(zhalgas_guest);

        AbstractUserFactory oleg_mobileFactory = new MobileAppUserFactory("MobileOleg", "oleg_olegovich@mobile.com");

        User oleg_mobileAdmin = oleg_mobileFactory.createAdmin();
        User oleg_mobileGuest = oleg_mobileFactory.createGuest();

        AbstractUserFactory aiganym_webFactory = new WebAppUserFactory("WebAiganym", "aiganym05@webuser.com");

        User aiganym_webAdmin = aiganym_webFactory.createAdmin();
        User aiganym_webGuest = aiganym_webFactory.createGuest();


        System.out.println("\nAbstract Factory results:");
        System.out.println(oleg_mobileAdmin);
        System.out.println(oleg_mobileGuest);
        System.out.println(aiganym_webAdmin);
        System.out.println(aiganym_webGuest);

        User yerassyl_user = new User.UserBuilder("yeras1k", "yerasyl04@gmail.com")
                .firstName("Yerassyl")
                .lastName("Ibrayev")
                .age(20)
                .phoneNumber("+7(777)5695252")
                .isActive(true)
                .build();

        System.out.println("\nBuilder result:");
        System.out.println(yerassyl_user);
    }
}
