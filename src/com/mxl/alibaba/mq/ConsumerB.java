package com.mxl.alibaba.mq;


//import com.aliyun.openservices.ons.api.*;
//
//import java.util.Properties;
//
public class ConsumerB {
//
//    public static void main(String[] args) {
//        Properties properties = new Properties();
//        // 您在 MQ 控制台创建的 Consumer ID
//        properties.put(PropertyKeyConst.ConsumerId, "CID-DEV-MXL-02");
//        // 鉴权用 AccessKey，在阿里云服务器管理控制台创建
//        properties.put(PropertyKeyConst.AccessKey, "LTAIqfzogBNFeohh");
//        // 鉴权用 SecretKey，在阿里云服务器管理控制台创建
//        properties.put(PropertyKeyConst.SecretKey, "zoahuhZKcEk5Q8Qtr927cLeFL8I4Eq");
//        // 设置 TCP 接入域名（此处以公共云公网环境接入为例）
//        properties.put(PropertyKeyConst.ONSAddr,
//                "http://onsaddr-internet.aliyun.com/rocketmq/nsaddr4client-internet");
//
//        Consumer consumer = ONSFactory.createConsumer(properties);
//        consumer.subscribe("TPC-DEV-TEST-MANYCONSUMER", "TagB", new MessageListener() {
//            @Override
//            public Action consume(Message message, ConsumeContext context) {
//                System.out.println("ConsumerB Receive: " + new String(message.getBody()) + message.getMsgID());
//                return Action.CommitMessage;
//            }
//        });
//        consumer.start();
//        System.out.println("Consumer Started");
//    }

}
