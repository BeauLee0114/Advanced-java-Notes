package com.bobo.jwt.service;

import com.bobo.jwt.entity.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/14 16:30
 * @Modified By
 */
public interface UserService {
    User login(User user);
}
