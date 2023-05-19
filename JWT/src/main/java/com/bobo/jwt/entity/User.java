package com.bobo.jwt.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/10/14 16:10
 * @Modified By
 */
@Data
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private String password;
}
