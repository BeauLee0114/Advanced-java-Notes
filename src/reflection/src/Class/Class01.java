package reflection.src.Class;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/20 14:18
 * @Modified By
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Cat cat = new Cat();
        Class cls = Class.forName("reflection.src.Cat");
        Class cls2 = Class.forName("reflection.src.Cat");
        System.out.println(cls);
        System.out.println(cls2);

    }
}
