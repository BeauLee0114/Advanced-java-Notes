package Pattern.Structural.Bridge;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/8 17:04
 * @Modified By
 */
public class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f%n", x, y, radius);
    }
}
