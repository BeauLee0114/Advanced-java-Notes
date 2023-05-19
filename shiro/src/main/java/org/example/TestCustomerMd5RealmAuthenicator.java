package org.example;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/9/29 13:57
 * @Modified By
 */
public class TestCustomerMd5RealmAuthenicator {
public static void main(String[] args) {
    //    创建安全管理器
    DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
//    注入realm
    CustomerMd5Realm realm = new CustomerMd5Realm();
//    设置realm使用hash凭证匹配器
    HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
    credentialsMatcher.setHashAlgorithmName("md5");
//    散列次数
    credentialsMatcher.setHashIterations(1024);
    realm.setCredentialsMatcher(credentialsMatcher);
    defaultSecurityManager.setRealm(realm);
//    将安全管理器注入安全工具
    SecurityUtils.setSecurityManager(defaultSecurityManager);
//    通过安全工具获取subject
    Subject subject = SecurityUtils.getSubject();
//    认证
    UsernamePasswordToken token = new UsernamePasswordToken("root","123");

    try {
        subject.login(token);
        System.out.println("登录成功");
    } catch (UnknownAccountException e) {
        e.printStackTrace();
        System.out.println("找不到用户名");
    }catch (IncorrectCredentialsException e){
        e.printStackTrace();
        System.out.println("密码错误");
    }
    }
}
