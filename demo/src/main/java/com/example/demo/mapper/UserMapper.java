/**
 * 创建人：  @author Andrew
 * 创建时间: 2026-05-09 09:39
 * 项目名称: demo
 * 文件名称: UserMapper
 */
package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
/**
 * 包名称： com.example.demo.mapper
 * 类名称：UserMapper
 * 类描述：TODO
 * 创建人：@author Andrew
 * 创建时间：2026-05-09 09:39
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 继承 BaseMapper 后，CRUD 方法都自动生成了，我们一行代码都不用写。
}
