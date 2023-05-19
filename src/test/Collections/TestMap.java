package test.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/4/13 11:52
 * @Modified By
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        HashMap<Object, Object> hashMap = new HashMap<>();
        map.put("0","只因");
        map.put("+","你");
        map.put("a","太美");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
