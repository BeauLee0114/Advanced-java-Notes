package Pattern.Creational.AbstractFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 14:25
 * @Modified By
 */
public class Client {
    private Shape shape;
    private Color color;

    public Client (AbstractFactory factory){
        shape = factory.createShape();
        color = factory.createColor();
    }
    public void run(){
        shape.draw();
        color.fill();
    }

}
