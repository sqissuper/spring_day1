package org.example;

import org.example.controller.LoginController;
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

        LoginController loginController = (LoginController) context.getBean("loginController");

        LoginController loginController1 = context.getBean(LoginController.class);
        System.out.println(loginController);
        System.out.println(loginController1);

        ((ClassPathXmlApplicationContext)context).close();


    }
}
