package Pattern.Creational.Prototype;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 15:09
 * @Modified By
 */
public class ConcretePrototype2 implements Prototype{
    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
