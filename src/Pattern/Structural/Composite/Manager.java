package Pattern.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/9 10:43
 * @Modified By
 */
public class Manager implements Employee{
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinates = new ArrayList<Employee>();

    public Manager(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }



    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", Position: " + position + ", Salary: " + salary);
        System.out.println("Subordinates: ");
        for (Employee employee : subordinates) {
            employee.showEmployeeDetails();
        }
    }
}
