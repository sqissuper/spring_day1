package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * ClassName:LoginController
 * Package:org.example.controller
 * Description:
 *
 * @Author:HP
 * @date:2021/6/8 10:43
 */
@Controller
public class LoginController {
    //1.属性注入
//    @Autowired
//    private LoginService loginService;

    //2.set注入
//    private LoginService loginService;
//
//    @Autowired
//    public void setLoginService(LoginService loginService) {
//        this.loginService = loginService;
//    }
//

    //构造函数注入
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public void sayHi() {
        loginService.sayHi();
    }


    @Bean
    public User user1() {
        User user = new User();
        user.setName("史强");
        user.setPassword("123456");
        return user;
    }

    @Bean
    public User user2() {
        User user = new User();
        user.setName("text1");
        user.setPassword("123");
        return user;
    }
}
