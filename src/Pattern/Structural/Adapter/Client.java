package Pattern.Structural.Adapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/8 16:22
 * @Modified By
 */
public class Client {
    public static void main(String[] args) {
        NewInterfaceImpl newInterface = new NewInterfaceImpl(); 
        OldInterface oldInterface = new Adapter(newInterface);
        oldInterface.oleMethod();
    }
}
