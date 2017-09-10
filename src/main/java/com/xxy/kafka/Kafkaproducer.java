package com.xxy.kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import kafka.serializer.StringEncoder;

public class Kafkaproducer extends Thread {  
    private String topic;  
      
    public Kafkaproducer(String topic){  
        super();  
        this.topic=topic;  
    }  
      
    @Override  
    public void run() {  
        Producer<Integer, String> producer=CreateProducer();  
        for (int i = 1; i < 10; i++) {  
            String message="message"+i;  
            producer.send(new KeyedMessage<Integer, String>(topic, message));  
            System.out.println("·¢ËÍ£º"+message);  
            try {  
                sleep(1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
    public Producer<Integer, String> CreateProducer(){  
        Properties props=new Properties();  
        props.setProperty("zookeeper.connect", "127.0.0.1:2181");  
        props.setProperty("serializer.class", StringEncoder.class.getName());  
        props.setProperty("metadata.broker.list", "127.0.0.1:9092");  
       // props.put("rebalance.max.retries", "5");
       // props.put("rebalance.backoff.ms", "1200");
        Producer<Integer, String> producer = new Producer<Integer, String>(new ProducerConfig(props));  
        return producer;  
    }  
      
    public static void main(String[] args) {  
        new Kafkaproducer("linlin").start();  
    }  
      
}  