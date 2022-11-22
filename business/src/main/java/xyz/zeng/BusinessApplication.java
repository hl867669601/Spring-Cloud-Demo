package xyz.zeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @time: 2022/11/20 15:37
 * @author: zengh
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class);
    }
}
