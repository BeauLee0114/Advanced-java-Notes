package test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 它的每个位上的数字的 3次幂之和等于它本身
 * @create 2023/3/8 14:04
 * @Modified By
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 0; i <=999; i++) {
            if (isNarcissisticNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isNarcissisticNumber(int a ){
        int x = a/100;
        int y = a/10%10;
        int z = a%10;
        if (a == x * x * x + y * y * y + z * z * z){
            return true;
        }
        return false;
    }
}
