package com.bobo.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Calendar;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/14 15:46
 * @Modified By
 */
public class JWTUtils {
    private static String TOKEN = "token!Q@W3e4r";

    public static String getToken(Map<String,String> map){
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(TOKEN)).toString();
    }
    public static DecodedJWT verify(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }
//    获取token中的payload
//    public static DecodedJWT getToken(String token){
//        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
//    }



}
