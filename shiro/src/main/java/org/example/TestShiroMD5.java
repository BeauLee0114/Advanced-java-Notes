package org.example;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/9/29 10:49
 * @Modified By
 */
public class TestShiroMD5 {
    public static void main(String[] args) {

////        传统使用md5
////        创建一个md5算法
//        Md5Hash md5Hash = new Md5Hash();
////          对123进行加密
//        md5Hash.setBytes("123".getBytes());
////        转为16进制
//        String s = md5Hash.toHex();
//        System.out.println(s);


//        使用md5构造方法
        Md5Hash md5Hash = new Md5Hash("123");
        System.out.println(md5Hash.toHex());

//        使用MD5+salt处理
        Md5Hash md5Hash1 = new Md5Hash("123", "x0*7s");
        System.out.println(md5Hash1.toHex());
//        增加哈希散列
        Md5Hash md5Hash2 = new Md5Hash("123","x0*7s",1024);
        System.out.println(md5Hash2.toHex());


    }
}
