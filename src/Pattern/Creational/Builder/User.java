package Pattern.Creational.Builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 14:48
 * @Modified By
 */
public class User {
    private String name;
    private String email;
    private String phone;
    private int age;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;
        private int age;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
    @Override
    public String toString() {
        return "User(name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + ")";
    }
}

