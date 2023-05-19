package Pattern.Structural.Adapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/8 16:23
 * @Modified By
 */
public class NewInterfaceImpl implements NewInterface{
    @Override
    public void newMethod() {
        System.out.println("New Method called" );
    }
}
