package Pattern.Structural.Decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/10 14:56
 * @Modified By
 */
public class Main {
    public static void main(String[] args) {
        // Create a new Espresso
        Beverage espresso = new Espresso();

        // Add milk to the Espresso
        Beverage milkEspresso = (Beverage) new Milk(espresso);

        // Print the description and cost of the milk espresso
        System.out.println(milkEspresso.getDescription() + " costs $" + milkEspresso.getCost());

    }
}
