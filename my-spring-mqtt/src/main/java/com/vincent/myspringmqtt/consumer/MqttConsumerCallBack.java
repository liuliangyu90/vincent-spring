package com.vincent.myspringmqtt.consumer;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
@Slf4j
public class MqttConsumerCallBack implements MqttCallback {
    /**
     * 客户端断开连接的回调
     */
    @Override
    public void connectionLost(Throwable throwable) {
        log.info("消费者断开链接");
    }

    /**
     * 消息到达的回调
     */
    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        /**
         * 通过主题订阅不同的消息
         */
//        System.out.println(String.format("接收消息主题 : %s",topic));
//        System.out.println(String.format("接收消息Qos : %d",message.getQos()));
//        System.out.println(String.format("接收消息内容 : %s",new String(message.getPayload())));
//        System.out.println(String.format("接收消息retained : %b",message.isRetained()));
        log.info("消费者开始接收消息，主题：{}，内容：{}",topic,message);
        message.clearPayload();
    }

    /**
     * 消息发布成功的回调
     */
    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        log.info("消费发送成功");
    }
}
