public class MobileAppUserFactory implements AbstractUserFactory {
    @Override
    public User createAdminUser() {
        return new User.UserBuilder("mobile_admin", "admin@mobile.com")
                .firstName("Mobile")
                .lastName("Admin")
                .isActive(true)
                .build();
    }

    @Override
    public User createGuestUser() {
        return new User.UserBuilder("mobile_guest", "guest@mobile.com")
                .firstName("Mobile")
                .lastName("Guest")
                .isActive(false)
                .build();
    }
}
