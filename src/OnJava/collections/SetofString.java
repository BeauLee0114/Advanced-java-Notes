package OnJava.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/9 11:11
 * @Modified By
 */
public class SetofString {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        for (int i = 0; i <100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Yellow");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Purple");
            colors.add("Blue");
        }
        System.out.println(colors);
    }
}
