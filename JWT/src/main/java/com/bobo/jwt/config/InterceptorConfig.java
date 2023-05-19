package com.bobo.jwt.config;

import com.bobo.jwt.interceptors.JWTinterceptors;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/17 15:33
 * @Modified By
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTinterceptors())
                .addPathPatterns("/user/test")//其他接口的token验证
                .excludePathPatterns("/user/login");//所有用户都放心
    }
}
