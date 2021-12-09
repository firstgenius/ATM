package Builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Yaroslav")
                .age(18)
                .occupation("Telegram")
                .build();
        System.out.println(user);
    }
}