package Pattern.Creational.SimpleFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description Simple factory
 * @create 2023/5/6 10:55
 * @Modified By
 */
public class ProductFactory {
    public static Product createProduct(String type){
        //推荐常量字符串放在前面，更加健壮的代码
        if (type.equals("A")){
            return new ProductA();
        }else if (type.equals("B")){
            return new ProductB();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Product ProductA = ProductFactory.createProduct("A");
        Product ProductB = ProductFactory.createProduct("B");
        ProductA.dosomethings();
        ProductB.dosomethings();
    }
}
