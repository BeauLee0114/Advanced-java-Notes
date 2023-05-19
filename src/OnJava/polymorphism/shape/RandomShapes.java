package OnJava.polymorphism.shape;

import OnJava.polymorphism.Shape;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/3 10:58
 * @Modified By
 */
public class RandomShapes {
    private Random rand = new Random(47);
    public Shape get(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new CirCle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public Shape[] array(int sz){
        Shape[] shapes = new Shape[sz];
        for (int i = 0; i <shapes.length; i++) {
            shapes[i]=get();
        }
        return shapes;
    }
}
