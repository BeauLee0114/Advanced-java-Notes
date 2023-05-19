package OnJava.interfaces;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description JDK17引入sealed密封类和密封接口
 * 基类或接口可以限制自己能派生出哪些类
 * @create 2023/1/5 11:16
 * @Modified By
 */
public class Sealed {

    sealed class Base permits D1,D2{}

    final class D1 extends Base{}
    final class D2 extends Base{}
}
