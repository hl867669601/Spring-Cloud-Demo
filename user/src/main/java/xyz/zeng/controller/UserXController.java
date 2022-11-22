package xyz.zeng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @time: 2022/11/20 15:45
 * @author: zengh
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserXController {

    @Value("${test.data}")
    private String data;

    @GetMapping("/t1")
    public String t1(){
        System.out.println(data);
        return "user-t1";
    }
}
