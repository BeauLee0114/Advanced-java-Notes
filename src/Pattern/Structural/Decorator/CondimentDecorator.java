package Pattern.Structural.Decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/10 14:53
 * @Modified By
 */
abstract public class CondimentDecorator {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription();
    }
}
