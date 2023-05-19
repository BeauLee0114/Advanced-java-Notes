package OnJava.collections;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * JDK16新增特性record关键字，record定义的是希望成为数据传输对象(也叫数据载体)的类。
 * 编译器自动生成
 * 不可变字段
 * 一个规范的构造器
 * 每个元素都有的访问器方法
 * equals
 * 自动创建规范的构造器
 * @create 2023/1/6 15:20
 * @Modified By
 */
record Employee(String name,int id){}

public class BasicRecord {
    public static void main(String[] args) {
        var bob = new Employee("Bob Dobbs",11);
        var dot = new Employee("Dorothy Gale",9);

        System.out.println(bob.name());
        System.out.println(bob.id());
        System.out.println(bob);

        var map = Map.of(bob,"A",dot,"B");
        System.out.println(map);
    }
}


