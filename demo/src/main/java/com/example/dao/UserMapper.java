/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserMaper
 * Author:   Double-L
 * Date:     2020/7/2 15:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.dao;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Double-L
 * @create 2020/7/2
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {
    List<User> findByAll();

    User findUserById(Integer id);

    int saveUser(User user);

    int deleteUser(Integer id);

    int updateUser(User user);




}