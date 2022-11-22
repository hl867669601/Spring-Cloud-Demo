package xyz.zeng.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @time: 2022/11/20 15:45
 * @author: zengh
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserXController {

    @Value("${test.data}")
    private String data;

    @GetMapping("/t1")
    public String t1(){
        log.info("t1接口");
        return "user-t1";
    }

    @GetMapping("/info")
    public String info(){
        log.info("info接口");
        return "userInfo";
    }
}
