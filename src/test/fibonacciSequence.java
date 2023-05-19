package test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/8 14:48
 * @Modified By
 */
public class fibonacciSequence {
    public static void main(String[] args) {
        int target = 7,result;
        int a1 = 1;
        int a2 = 1;
        for (int i = 0; i <=target; i++) {
            result = a1+a2;
            a1 = a2;
            a2 = result;
            System.out.println(","+result);
        }
    }
}
