package OnJava.housekeeping.TypeInference;

import OnJava.housekeeping.Spiciness;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/12/21 16:55
 * @Modified By
 */
public class ForTypeInference {
    public static void main(String[] args) {
        //JDK11用于简化局部变量定义的特性。最现在JDK10中添加，在一个局部定义中，编译器自动发现类型，这就是类型推断，用var关键字启用它。
        //类型推断，类型推断不能用于方法的参数，java不支持默认参数
        //十分适合for循环
        for (var s: Spiciness.values()) {
            System.out.println(s);
        }
    }
}
