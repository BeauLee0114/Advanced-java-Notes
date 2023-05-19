package OnJava.polymorphism;

import OnJava.polymorphism.shape.RandomShapes;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/3 11:22
 * @Modified By
 */
public class Shapes {
        public static void main(String[] args) {
            RandomShapes randomShapes = new RandomShapes();
            for (Shape shape:randomShapes.array(9)){
                shape.draw();
            }
        }
}
