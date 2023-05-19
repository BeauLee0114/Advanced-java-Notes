package String;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/9/27 9:53
 * @Modified By
 */
public class StringDemo {
    public static void main(String args[]) {
        String site = "www.runoob.com";
        int len = site.length();
        String name = "网站是";
        String key = "runoob";
        System.out.println("菜鸟教程网址长度 : " + len);
//        concat连接字符串
        System.out.println(name.concat(site));
//        contains包含字符串
        System.out.println(site.contains(key));
//        转换大写
        System.out.println(site.toUpperCase());
//        split拆分字符串
        System.out.println("分割字符串");
        for (String retval:site.split("\\.",3)){
            System.out.println(retval);
        }
        System.out.println(site.substring(0,site.length()));
    }
}
