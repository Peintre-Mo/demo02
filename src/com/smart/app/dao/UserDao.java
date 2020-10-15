package com.smart.app.dao;

import com.smart.app.entity.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User selectUserByName(String username);

    /**
     * 保存对象是否成功
     *
     * @param user
     * @return
     */
    int insert(User user);

}
