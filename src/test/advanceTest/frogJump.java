package test.advanceTest;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 青蛙跳
 * @create 2023/3/14 16:52
 * @Modified By
 */
public class frogJump {
    public static void main(String[] args) {
        System.out.println(frogJumpAlgorithm(10));
    }

    public static int frogJumpAlgorithm(int n){
        if ( n==1 || n==2){
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 0; i <n; i++) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

}
