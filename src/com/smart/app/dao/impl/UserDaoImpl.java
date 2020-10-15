package com.smart.app.dao.impl;

import com.smart.app.dao.UserDao;
import com.smart.app.entity.User;

/**
 * 此类与数据库进行交互
 *
 *
 * 跨域问题
 * 协议  + ip + 端口
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User selectUserByName(String username) {
        return null;
    }

    /**
     * 后期做准备
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {
        return 0;
    }
}
