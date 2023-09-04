package com.vincent.myspringmqtt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * 教程1：https://blog.csdn.net/weixin_46822367/article/details/120196198   当前使用教程
 * 教程2：https://www.w3cschool.cn/article/6048135.html
 * docker 安装：https://www.cnblogs.com/yourstars/p/15247707.html
 * Linux安装 ：https://www.zhihu.com/tardis/sogou/art/164930347
 * 官网下载地址：https://mosquitto.org/download/
 * 客户端下载：https://softblade.de/en/download-2/
 * 教程：
 * 一个通道：https://www.jianshu.com/p/a71f1b07872d
 * 两个通道：https://blog.csdn.net/bugAndMe/article/details/89947373
 */
@SpringBootApplication
public class MySpringMQTTApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MySpringMQTTApplication.class, args);
    }

}
