public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("yeras1k", "yerasyl04@gmail.com")
                .firstName("Yerassyl")
                .lastName("Ibrayev")
                .age(20)
                .phoneNumber("+7(777)5695252")
                .isActive(true)
                .build();

        User user2 = new User.UserBuilder("bob322", "robertcool@outlook.com")
                .firstName("Robert")
                .lastName("Pattinson")
                .isActive(false)
                .build();

        User user3 = new User.UserBuilder("cybersid9", "ervjnekjfvn@example.com")
                .age(23)
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}