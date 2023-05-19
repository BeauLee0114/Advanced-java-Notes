package OnJava.functional;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description Java8方法引用
 * 类名，对象名：：方法名
 * @create 2023/1/4 11:01
 * @Modified By
 */
interface Callable{
    void call(String s);
}

class Describe{
    void show(String msg){
        System.out.println(msg);
    }
}

public class MethodReferenes {
    static void hello(String name){
        System.out.println("Hello,"+name);
    }
    static class Description{
        String about;
        Description(String desc){about = desc;}
        void help(String msg){
            System.out.println(about+""+msg);
        }
    }

    static class Helper{
        static void assist(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");

        c=MethodReferenes::hello;
        c.call("Bob");

        c=new Description("valuable")::help;
        c.call("information");

        c=Helper::assist;
        c.call("Help!");
    }
}
