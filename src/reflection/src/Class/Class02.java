package reflection.src.Class;

import reflection.src.Car;

import java.lang.reflect.Field;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/20 17:16
 * @Modified By
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "reflection.src.Car";
//        1.获取到Car类 对应的Class对象
        Class<?> cls = Class.forName(classAllPath);
//        2.输出cls
        System.out.println(cls);
        System.out.println(cls.getClasses());
//        3.获得包名
        System.out.println(cls.getPackage().getName());
//        4,获得全类名
        System.out.println(cls.getName());
//        5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);
//        6.通过反射获取属性brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
//        7.通过反射给属性复制
        brand.set(car,"路虎");
        System.out.println(brand.get(car));
//        8.希望可以得到所有的属性（字段）
        System.out.println("==================");
        Field[] fields = cls.getFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }


    }
}
