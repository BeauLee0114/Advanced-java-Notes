package Pattern.Creational.Prototype;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 15:20
 * @Modified By
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        prototypeRegistry.registerPrototype("P1",concretePrototype1);
        prototypeRegistry.registerPrototype("P2",concretePrototype2);

        Prototype p1 = prototypeRegistry.getPrototype("P1");
        System.out.println(p1.getClass().getName());

    }
}
