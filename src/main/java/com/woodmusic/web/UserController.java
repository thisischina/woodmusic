package com.woodmusic.web;

import com.woodmusic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Controller
@RequestMapping("pages/html")
public class UserController {
    private UserService userService;

    @ResponseBody
    @RequestMapping("/add")
    public String add(){
        System.out.println("开始注册+");
        int i=userService.addUser();
        System.out.println("添加成功"+i);
        return i>0?"success":"error";
    }
}
