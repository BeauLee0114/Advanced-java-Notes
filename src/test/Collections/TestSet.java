package test.Collections;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description 集合类(Set)测试，不允许出现重复元素，不支持随机访问
 * @create 2023/3/29 17:13
 * @Modified By
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<Object> hashSet1 = new LinkedHashSet<>();
        hashSet1.addAll(Arrays.asList("A","B","C","D"));
        System.out.println(hashSet1);
        System.out.println(hashSet.add("AAA"));
        System.out.println(hashSet.add("AAA"));
        System.out.println(hashSet);
    }
}
