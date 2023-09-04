package com.vincent.myspringmqtt.controller;

import com.vincent.myspringmqtt.consumer.MqttConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
//    @Resource
    private MqttConsumerConfig client;

    @Value("${spring.mqtt.client.id}")
    private String clientId;

    @RequestMapping("/connect")
    @ResponseBody
    public String connect(){
        client.connect();
        return clientId + "连接到服务器";
    }

    @RequestMapping("/disConnect")
    @ResponseBody
    public String disConnect(){
        client.disConnect();
        return clientId + "与服务器断开连接";
    }
}
