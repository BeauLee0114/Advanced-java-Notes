package com.bobo.jwt.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bobo.jwt.entity.User;
import com.bobo.jwt.service.UserService;
import com.bobo.jwt.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/14 16:50
 * @Modified By
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/login")  
    public Map<String,Object>login(User user){
            Map<String,Object> result = new HashMap<>();
            log.info("用户名：[{}]",user.getName());
            log.info("密码：[{}]",user.getPassword());
            try {
            User userDB = userService.login(user);
            HashMap<String, String> map = new HashMap<>();
            map.put("id",userDB.getId());
            map.put("username",userDB.getName());
            String token = JWTUtils.getToken(map);
            result.put("state",true);
            result.put("msg","登陆成功！！！");
            result.put("token",token);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("state","false");
            result.put("msg",e.getMessage());
        }
    return result;
    }


    @PostMapping("/user/test")
    public Map<String, Object> test(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        log.info("用户id:[{}]",verify.getClaim("id").asString());
        log.info("用户name:[{}]",verify.getClaim("name").asString());
        map.put("state",true);
        map.put("msg","请求成功！");
        return map;
    }

}
