package Pattern.Structural.Composite;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/9 10:41
 * @Modified By
 */
public class Develops implements Employee {
    private String name;
    private String position;

    private int salary;

    public Develops(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public void showEmployeeDetails() {
        System.out.println("Name:"+name+"Position:"+position+"Salary:"+salary);
    }
}
