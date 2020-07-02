/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   Double-L
 * Date:     2020/7/2 15:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.service.impl;

import com.example.entity.User;
import com.example.dao.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Double-L
 * @create 2020/7/2
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public List<User> findByAll() {
        return userMapper.findByAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}