/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-05-09 08:53
 * 项目名称: demo
 * 文件名称: HelloControler
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名称： com.example.demo
 * 类名称：HelloControler
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-05-09 08:53
 *
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello, Spring Boot!</h1>";
    }
}