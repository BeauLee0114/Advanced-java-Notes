package OnJava.collections;

import java.util.ArrayDeque;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/3 16:06
 * @Modified By
 */
public class StackTest {
    public static void main(String[] args) {
        //java6加入ArrayDeque
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s:"My dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
