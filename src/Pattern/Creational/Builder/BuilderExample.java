package Pattern.Creational.Builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 14:50
 * @Modified By
 */
public class BuilderExample {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Tom")
                .setEmail("tom@example.com")
                .setPhone("1234567890")
                .setAge(30)
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Mary")
                .setPhone("0987654321")
                .build();
        System.out.println(user2);
    }
}
