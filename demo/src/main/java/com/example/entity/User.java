/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: User
 * Author:   Double-L
 * Date:     2020/7/2 14:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Double-L
 * @create 2020/7/2
 * @since 1.0.0
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}