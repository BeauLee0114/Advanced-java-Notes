package Pattern.Creational.Factory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 11:51
 * @Modified By
 */
public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
