package com.smart.app.service.impl;

import com.smart.app.dao.UserDao;
import com.smart.app.dao.impl.UserDaoImpl;
import com.smart.app.entity.User;
import com.smart.app.service.UserService;

/**
 *业务层，处理业务，与前端，DAO数据之间的传递
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public String login() {
        return null;
    }

    /**
     * 请熟读说明文档
     *
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        boolean flag = false;
        //  判断用户名是否存在
        //  如果用户名不存在则 往数据库添加数据
        User temp = userDao.selectUserByName(user.getUsername());
        if (temp == null) {
            try {
                int count = userDao.insert(user);
                flag = count > 0;
            } catch (Exception exception) {
                System.out.println("注册失败");
            }
        } else {
            System.out.println("用户名已经存在");
        }
        return flag;
    }


}
