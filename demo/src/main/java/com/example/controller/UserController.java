/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserController
 * Author:   Double-L
 * Date:     2020/7/2 15:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Double-L
 * @create 2020/7/2
 * @since 1.0.0
 */

@SuppressWarnings("ALL")
@Controller
public class UserController {
    @Autowired(required = true)
    private UserService userService;

    @RequestMapping("/findByAll")
    public String index(Model model){
        List<User> list = userService.findByAll();
        model.addAttribute("users",list);
        return "user/userList";
    }

    @RequestMapping("/")
    public String list(Model model){
        List<User> users = userService.findByAll();
        model.addAttribute("users",users);
        return "user/userList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user){
        userService.updateUser(user);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        userService.deleteUser(id);
        return "redirect:/";
    }

}