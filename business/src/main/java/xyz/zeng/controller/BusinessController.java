package xyz.zeng.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zeng.feign.UserFeign;

/**
 * @time: 2022/11/20 15:39
 * @author: zengh
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/business")
@RefreshScope
public class BusinessController {

    @Value(value = "${test.data}")
    private String data;

    @Autowired
    UserFeign userFeign;

    @GetMapping("/t1")
    public String t1(){
        log.info("t1接口");
        return data;
    }
    @GetMapping("/t2")
    public String t2(){
        String userInfo  = userFeign.info();
        log.info("t2接口");
        log.info(userInfo);
        return userInfo;
    }
}
