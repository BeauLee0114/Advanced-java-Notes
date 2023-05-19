package OnJava.Operation;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/5 10:17
 * @Modified By
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Service1 implements Service {
    Service1(){}//包访问权限
    @Override
    public void method1() {
        System.out.println("Service1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service1 method2");
    }
}

class Service1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Service1();
    }
}

class Service2 implements Service{
    Service2(){}

    @Override
    public void method1() {
        System.out.println("Service2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service2 method2");
    }
}

class Service2Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Service2();
    }
}

public class Factories{
    public static void
    serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Service1Factory());
        //服务是完全可以互换的
        serviceConsumer(new Service2Factory());
    }
}