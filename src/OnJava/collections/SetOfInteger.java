package OnJava.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/6 17:02
 * @Modified By
 */
public class SetOfInteger{
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset  = new HashSet<>();
        for (int i = 0; i <10000; i++) {
            intset.add(rand.nextInt(30));
            System.out.println(intset);
        }
    }
}
