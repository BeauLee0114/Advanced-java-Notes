package OnJava.functional;

import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 高阶函数
 * 一个能接受函数作为参数或能把函数当返回值的函数
 * @create 2023/1/4 14:59
 * @Modified By
 */
interface
FuncSS extends Function<String,String>{}

public class ProduceFunction {
    static FuncSS produce(){
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }

}
