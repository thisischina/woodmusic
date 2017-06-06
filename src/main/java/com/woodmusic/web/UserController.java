package com.woodmusic.web;

import com.woodmusic.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@RequestMapping("user")
public class UserController {
    private UserService userService;

    public String add(){
        int i=userService.addUser();
        return i>0?"success":"error";
    }
}
