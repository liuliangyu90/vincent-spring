package com.vincent.myspringmqtt.controller;

import com.vincent.myspringmqtt.config.MqttGateway;
import com.vincent.myspringmqtt.provider.MqttProviderConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author vincent.liu
 * @apiNote
 */
@RestController
@Slf4j
public class ProviderController {
//    @Resource
    private MqttProviderConfig providerClient;

//    @RequestMapping("/sendMessage")
//    @ResponseBody
    public String sendMessage(int qos,boolean retained,String topic,String message){
        try {
            providerClient.publish(qos, retained, topic, message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "发送失败";
        }
    }
    @Resource
    MqttGateway mqttGateway;
    @GetMapping("/sendMessage")
    @ResponseBody
    public String send(int qos,boolean retained,String topic,String message){
        mqttGateway.sendToMqtt(topic,qos,retained,message);
        return  "发送成功";
    }
}
