package xyz.zeng.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// name指定服务吗。path为Controller的RequestMapping的值
@FeignClient(name = "user-service",path = "/user")
public interface UserFeign {

    @RequestMapping("info")
    String info();
}
