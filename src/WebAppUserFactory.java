public class WebAppUserFactory implements AbstractUserFactory {
    @Override
    public User createAdminUser() {
        return new User.UserBuilder("web_admin", "admin@webapp.com")
                .firstName("Web")
                .lastName("Admin")
                .isActive(true)
                .build();
    }

    @Override
    public User createGuestUser() {
        return new User.UserBuilder("web_guest", "guest@webapp.com")
                .firstName("Web")
                .lastName("Guest")
                .isActive(false)
                .build();
    }
}
