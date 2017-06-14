package com.woodmusic.service.impl;

import com.woodmusic.dao.UserDao;
import com.woodmusic.entity.User;
import com.woodmusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao;
    public int addUser(User user) {
        return userDao.add(user);
    }

    public boolean getUserByTel(String string) {
        return false;
    }
}
