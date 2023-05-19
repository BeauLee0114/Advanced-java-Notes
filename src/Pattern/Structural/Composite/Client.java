package Pattern.Structural.Composite;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/9 10:47
 * @Modified By
 */
public class Client {
    public static void main(String[] args) {
        Employee dev1 = new Develops("John Doe", "Developer", 5000);
        Employee dev2 = new Develops("Jane Smith", "Developer", 6000);

        Manager manager = new Manager("Bob Johnson", "Manager", 10000);
        manager.add(dev1);
        manager.add(dev2);

        manager.showEmployeeDetails();
    }
}
