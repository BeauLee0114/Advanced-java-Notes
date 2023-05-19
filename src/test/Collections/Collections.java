package test.Collections;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/21 10:50
 * @Modified By
 */
public class Collections {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        ListIterator<String> iterator = list.listIterator();
        iterator.next();
        iterator.set("X");
        System.out.println(list );
    }


}
