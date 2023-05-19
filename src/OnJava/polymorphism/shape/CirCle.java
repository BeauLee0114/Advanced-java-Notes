package OnJava.polymorphism.shape;

import OnJava.polymorphism.Shape;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/3 10:37
 * @Modified By
 */
public class CirCle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
