package com.bobo.jwt.DAO;

import com.bobo.jwt.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/14 16:17
 * @Modified By
 */
@Mapper
public interface UserDAO {
//    直接根据用户名密码登录
    User login (User user);
}
