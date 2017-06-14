package com.woodmusic.web;

import com.woodmusic.entity.User;
import com.woodmusic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Controller
@RequestMapping("user")
public class UserController {
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        System.out.println("开始注册+");
        user=new User();
        int i=userService.addUser(user);
        System.out.println("添加成功"+i);
        return i>0?"success":"error";
    }
}
