package test.advanceTest;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/15 14:36
 * @Modified By
 */
public class Plalindrome {
    public static void main(String[] args) {
        System.out.println(isPlaindrome_way1("abcba"));
        System.out.println(isPlaindrome_way2("abcba"));
    }



    //内置函数反转判断
    private static boolean isPlaindrome_way1(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

    //使用for循环判断
    private static boolean isPlaindrome_way2(String str){
        char[] chars = str.toCharArray();
        int maxSize = chars.length/2;
        for (int i = 0; i <maxSize ; i++) {
            if (chars[i]!= chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }


}
