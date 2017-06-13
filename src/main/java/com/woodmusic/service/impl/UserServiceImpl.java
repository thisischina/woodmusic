package com.woodmusic.service.impl;

import com.woodmusic.dao.UserDao;
import com.woodmusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao;
    public int addUser() {
        return userDao.add();
    }
}
