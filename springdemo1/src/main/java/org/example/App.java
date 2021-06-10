package org.example;

import org.example.controller.LoginController;
import org.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:App
 * Package:org.example
 * Description:
 *
 * @Author:HP
 * @date:2021/6/8 10:37
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        User user = (User) context.getBean("user1");
//        System.out.println(user);
//
//        User user2 = context.getBean("user2",User.class);
//        System.out.println(user2);

        LoginController loginController = context.getBean(LoginController.class);
        loginController.sayHi();
    }
}
