package com.woodmusic.service;

import com.woodmusic.entity.User;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public interface UserService {
    public boolean getUserByTel(String string);

    public int addUser(User user);
}
