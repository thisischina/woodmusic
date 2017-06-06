package com.woodmusic.service.impl;

import com.woodmusic.dao.UserDao;
import com.woodmusic.service.UserService;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class UserServiceImpl implements UserService{
    public UserDao userDao;
    public int addUser() {
        return userDao.add();
    }
}
