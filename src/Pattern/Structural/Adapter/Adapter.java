package Pattern.Structural.Adapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @DescriptionIn this example, the Adapter class implements the OldInterface and uses the NewInterface to provide the necessary functionality.
 * The Client code can then use the Adapter to call the new method using the old interface.
 * @create 2023/5/8 16:19
 * @Modified By
 */
public class Adapter implements OldInterface{

    private NewInterface newInterface;

    public Adapter(NewInterface newInterface) {
        this.newInterface = newInterface;
    }

    @Override
    public void oleMethod() {
        newInterface.newMethod();
    }
}
