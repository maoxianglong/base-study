package com.mxl.alibaba.mq;

//import com.aliyun.openservices.ons.api.*;
//
//import java.util.Properties;
//
public class Producter {
//
//
//        public static void main(String[] args) {
//            Properties properties = new Properties();
//            // 您在 MQ 控制台创建的 Producer ID
//            properties.put(PropertyKeyConst.ProducerId, "PID-DEV-MXL");
//            // 鉴权用 AccessKey，在阿里云服务器管理控制台创建
//            properties.put(PropertyKeyConst.AccessKey,"LTAIqfzogBNFeohh");
//            // 鉴权用 SecretKey，在阿里云服务器管理控制台创建
//            properties.put(PropertyKeyConst.SecretKey, "zoahuhZKcEk5Q8Qtr927cLeFL8I4Eq");
//            // 设置 TCP 接入域名（此处以公共云的公网接入为例）
//            properties.put(PropertyKeyConst.ONSAddr,
//                    "http://onsaddr-internet.aliyun.com/rocketmq/nsaddr4client-internet");
//
//            Producer producer = ONSFactory.createProducer(properties);
//            // 在发送消息前，必须调用 start 方法来启动 Producer，只需调用一次即可
//            producer.start();
//            int i = 0;
//            for (;i<10;i++){
//                if(i%2 == 0){
//                    Message msg = new Message("TPC-DEV-TEST-MANYCONSUMER", "TagA", "XIAOMI".getBytes());
//                    SendResult sendResult = producer.send(msg);
//                    System.out.println("Send Message success. Message ID is: " + sendResult.getMessageId() + msg.getTag());
//                }else{
//                    Message msg = new Message("TPC-DEV-TEST-MANYCONSUMER", "TagB", "HUAWEI".getBytes());
//                    SendResult sendResult = producer.send(msg);
//                    System.out.println("Send Message success. Message ID is: " + sendResult.getMessageId() + msg.getTag());
//                }
//            }
//            producer.shutdown();
//        }



}
