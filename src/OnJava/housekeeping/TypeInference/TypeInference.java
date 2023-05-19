package OnJava.housekeeping.TypeInference;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/12/21 16:23
 * @Modified By
 */

class Plumbus{}

public class TypeInference {
    void method(){

        String hello1 = "Hello";

        var hello = "Hello";

        Plumbus pb1 = new Plumbus();
        var pb2 = new Plumbus();
    }
    static void staticMethod(){
        var hello = "Hello!";
        var pb2 = new Plumbus();
    }
}

class NoInference{
    String field1 = "Filed initialization";
}
