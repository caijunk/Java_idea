package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
//查询所有
    List<User> findAll();
//保存用户
    void saveUser(User user);
// 更新用户
    void updateUser(User user);
//    删除功能
    void deleteUser(Integer userId);
//    根据ID查询信息
    User findById(Integer userId);

}
