package org.example;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/9/28 14:48
 * @Modified By
 */
public class ShiroAuthenticaticator {
    public static void main(String[] args) {
//      1。创建安全管理器对象
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
//      2。给安全管理器设置realm
        securityManager.setRealm(new IniRealm("classpath:shiro.ini"));
//      3。SecurityUtils 给全局安全工具类设置安全管理器
        SecurityUtils.setSecurityManager(securityManager);
//      4。关键对象Subject主体
        Subject subject = SecurityUtils.getSubject();
//      5.创建令牌
        UsernamePasswordToken token = new UsernamePasswordToken("root","root");
        try {
            System.out.println(subject.isAuthenticated());
            subject.login(token);//用户认证
            System.out.println(subject.isAuthenticated());
            System.out.println("认证成功");
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            System.out.println("认证失败用户名不存在");
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            System.out.println("密码错误");
        }
    }
}
