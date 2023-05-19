package OnJava.interfaces;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 接口的private方法
 * 随着default和static方法引入接口，我们可以在接口中编写方法代码了，但同时可能不想让这些放啊发成为public的。在old类中，fd（）和fs（）分别是default和static方法。
 * 这些方法只被f()和g（）调用，所以我们希望它们是private的
 * 类jdk9 使用了jdk9最终确定的特性，将fd（）和fs（）转换为private方法。
 * fd（）不需要default关键字，因为变成了private后自动就是default的了。
 * @create 2023/1/5 10:45
 * @Modified By
 */

interface Old{
    default void fd(){
        System.out.println("Old::fd()");
    }
    static void fs(){
        System.out.println("Old::fs()");
    }
    default void f(){
        fd();
    }
    static void g(){
        fs();
    }
}

class ImplOld implements Old{}

interface JDK9{
    private void fd(){
        System.out.println("JDk9::fd()");
    }
    private static void fs(){
        System.out.println("JDK9::fs()");
    }
    default void f(){
        fd();
    }
    static void g(){
        fs();
    }
}
class ImplJdk9 implements JDK9{}

public class PrivateInterfaceMethods {
    public static void main(String[] args) {
        new ImplOld().f();
        Old.g();
        new ImplJdk9().f();
        JDK9.g();
    }
}
