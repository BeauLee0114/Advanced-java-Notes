package Pattern.Creational.Factory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 11:53
 * @Modified By
 */
public class Client {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Animal animal = dogFactory.createAnimal();
        animal.makeSound();

        CatFactory catFactory = new CatFactory();
        animal = catFactory.createAnimal();
        animal.makeSound();
    }
}
