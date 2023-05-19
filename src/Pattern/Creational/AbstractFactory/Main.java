package Pattern.Creational.AbstractFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 14:36
 * @Modified By
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ShapeColorFactory());
        client.run();
        Client client1 = new Client(new ShapeColorFactory2());
        client1.run();
    }
}
