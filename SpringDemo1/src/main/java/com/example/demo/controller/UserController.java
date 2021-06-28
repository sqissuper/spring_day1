package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:UserController
 * Package:com.example.demo.controller
 * Description:
 *
 * @Author:HP
 * @date:2021/6/28 15:27
 */

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
//    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/say")
    @ResponseBody
    public String getIndex(String name) {
        if(name == null || name.equals("")) {
            log.error("级别：error");
        }
        log.debug("级别：debug");
        log.info("级别：info");
        log.warn("级别：warn");
        log.trace("级别：track");
        return "hello spring";
    }
}
