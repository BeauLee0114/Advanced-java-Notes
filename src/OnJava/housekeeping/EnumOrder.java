package OnJava.housekeeping;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/12/21 15:40
 * @Modified By
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s :Spiciness.values()) {
            //ordinal()方法用于标识特定enum常量的声明顺序
            // 以及一个静态的values方法，按照声明顺序生成一个enum常量值的数组
            System.out.println(s+",ordinal"+s.ordinal());
        }
    }
}
