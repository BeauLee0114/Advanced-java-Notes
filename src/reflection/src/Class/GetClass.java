package reflection.src.Class;

import reflection.src.Car;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/21 15:07
 * @Modified By
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
//        1.Class.forName
        String classAllPath="reflection.src.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
//        2.类名.class,应用场景：用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);
//        3.对象.getClass(),应用场景，有对象的实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
//        4.通过类加载器（4种）来获得类的Class对象
//        （1）先得到类的加载器car
        ClassLoader classLoader = car.getClass().getClassLoader();
//        (2)通过类加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        System.out.println("哈希值==========");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

//        5基本数据(int,char,boolean,float,double,byte,short)
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);

//        6.基本数据类型对应的包装类，可以通过.TYPE得到Class类对象

    }
}
