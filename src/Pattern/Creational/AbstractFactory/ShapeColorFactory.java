package Pattern.Creational.AbstractFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 14:23
 * @Modified By
 */
public class ShapeColorFactory implements AbstractFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
