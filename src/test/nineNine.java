package test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/8 14:17
 * @Modified By
 */
public class nineNine {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                if (i == j){
                    System.out.println(j+"*"+i+"="+i*j+"");
                }else {
                    System.out.printf(j+"*"+i+"="+i*j+"\t");
                }
            }
        }
    }





}
