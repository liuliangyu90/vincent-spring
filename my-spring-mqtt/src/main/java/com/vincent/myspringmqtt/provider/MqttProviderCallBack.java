package com.vincent.myspringmqtt.provider;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
public class MqttProviderCallBack implements MqttCallback {
    @Value("${spring.mqtt.client.id}")
    private String clientId;

    /**
     * 与服务器断开的回调
     */
    @Override
    public void connectionLost(Throwable throwable) {
        log.info("生产者断开");
    }
    /**
     * 消息到达的回调
     */
    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        log.info("生产者接收");
    }
    /**
     * 消息发布成功的回调
     */
    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info("生产者发送成功");
    }
}
