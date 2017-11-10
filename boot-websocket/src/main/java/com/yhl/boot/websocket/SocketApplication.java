package com.yhl.boot.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Charles
 * @Title: SocketApplication
 * @Package com.yhl.boot.websocket
 * @Description: TODO
 * @date 2017/11/7 11:32
 */
@ComponentScan(basePackages ="com.yhl.boot.websocket")
@SpringBootApplication
@EnableScheduling
public class SocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class,args);
    }
}
