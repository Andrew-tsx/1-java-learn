/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-05-09 09:28
 * 项目名称: demo
 * 文件名称: User
 */
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 包名称： com.example.demo.entity
 * 类名称：User
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-05-09 09:28
 *
 */
@TableName("app_user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    // 必须要有 getter 和 setter 方法，IDEA 可通过 Alt+Insert 快捷键快速生成
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
