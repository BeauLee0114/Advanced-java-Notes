package Pattern.Structural.Decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/10 14:53
 * @Modified By
 */
public class Espresso implements Beverage{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
