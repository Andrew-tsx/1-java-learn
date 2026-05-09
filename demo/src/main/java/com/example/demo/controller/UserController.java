/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-05-09 09:40
 * 项目名称: demo
 * 文件名称: UserController
 */
package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * 包名称： com.example.demo.controller
 * 类名称：UserController
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-05-09 09:40
 *
 */
@RestController
@RequestMapping("/users") // 整个类的路径前缀
public class UserController {

    @Autowired // 自动注入 Mapper，这就是 Spring 的核心：依赖注入
    private UserMapper userMapper;

    @GetMapping
    public List<User> listUsers() {
        return userMapper.selectList(null); // 查询所有用户
    }
}
