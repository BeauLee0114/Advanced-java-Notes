package test;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/11 14:31
 * @Modified By
 */
public class test01 {
    public static void main(String[] args) {
        HashMap<Test, Integer> map = new HashMap<>();
        map.put(new Test("A"),10);
        System.out.println(new Test("A"));
    }
    static class Test{
        private String name;

        public Test(String name){
            this.name = name;
        }
        public boolean equals(Object obj){
            return ((Test) obj).name.equals(name);
        }
    }
}
