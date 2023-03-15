package com.lpc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IntelliJ IDEA-2018 3.2.
 *
 * @ClassName: UserController
 * @Date: 2023/03/06/21:42
 * @Author: 李鹏程
 * @Description:
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String save(){
        System.out.println("hot-fix test1");
        System.out.println("master test1");
        System.out.println("hot-fix test2");
        return "MySpringBoot success is running...";
    }


}
