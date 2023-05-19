package org.example;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/9/29 14:02
 * @Modified By
 */
public class CustomerMd5Realm extends AuthorizingRealm{

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

//        获取身份信息
        String principal = (String) token.getPrincipal();
//        参数1：名字 参数2：密码MD5值 参数3 注册的随机盐 参数4 realm的名字
        if ("root".equals(principal)){
            return new SimpleAuthenticationInfo(principal,
                    "4e74025f1b7ac66e08cde845d861b741",
                    ByteSource.Util.bytes("x0*7s"),
                    this.getName());
        }
        return null;
    }
}
