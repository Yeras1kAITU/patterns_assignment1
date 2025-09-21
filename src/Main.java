public class Main {
    public static void main(String[] args) {
        UserFactory adminFactory = new AdminUserFactory();
        UserFactory guestFactory = new GuestUserFactory();

        User systemAdmin = adminFactory.createUser();
        User systemGuest = guestFactory.createUser();

        System.out.println("Factory Method results:");
        System.out.println(systemAdmin);
        System.out.println(systemGuest);

        AbstractUserFactory webUserFactory = new WebAppUserFactory();
        AbstractUserFactory mobileUserFactory = new MobileAppUserFactory();

        User webAdminUser = webUserFactory.createAdminUser();
        User webGuestUser = webUserFactory.createGuestUser();

        User mobileAdminUser = mobileUserFactory.createAdminUser();
        User mobileGuestUser = mobileUserFactory.createGuestUser();

        System.out.println("\nAbstract Factory results:");
        System.out.println(webAdminUser);
        System.out.println(webGuestUser);
        System.out.println(mobileAdminUser);
        System.out.println(mobileGuestUser);

        User customYerassyl = new User.UserBuilder("yeras1k", "yerasyl04@gmail.com")
                .firstName("Yerassyl")
                .lastName("Ibrayev")
                .age(20)
                .phoneNumber("+7(777)5695252")
                .isActive(true)
                .build();

        System.out.println("\nBuilder result:");
        System.out.println(customYerassyl);
    }
}
