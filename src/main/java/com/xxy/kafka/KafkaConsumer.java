package com.xxy.kafka;
import java.util.HashMap;
import java.util.List;  
import java.util.Map;  
import java.util.Properties;  
import kafka.consumer.Consumer;  
import kafka.consumer.ConsumerConfig;  
import kafka.consumer.ConsumerIterator;  
import kafka.consumer.KafkaStream;  
import kafka.javaapi.consumer.ConsumerConnector;  
  
  
public class KafkaConsumer extends Thread{  
    private String topic;  
      
    private KafkaConsumer(String topic) {  
        super();  
        this.topic=topic;  
    }  
      
    @Override  
    public void run() {  
        ConsumerConnector consumer = createConsumer();  
        Map<String,Integer> topicCountMap=new HashMap<String, Integer>();  
        topicCountMap.put(topic, 1);  
          
        Map<String, List<KafkaStream<byte[], byte[]>>> MessageStreams = consumer.createMessageStreams(topicCountMap);  
        KafkaStream<byte[], byte[]> kafkaStream = MessageStreams.get(topic).get(0);  
        ConsumerIterator<byte[], byte[]> iterator = kafkaStream.iterator();  
        while (iterator.hasNext()) {  
            String message = new String(iterator.next().message());  
            System.out.println("Ω” ’µΩ£∫"+message);  
        }  
    }  
      
    public ConsumerConnector createConsumer(){  
        Properties properties = new Properties();  
        properties.setProperty("zookeeper.connect", "127.0.0.1:2181");  
        properties.setProperty("group.id", "group1");  
        properties.put("zookeeper.session.timeout.ms", "4000");  
        properties.put("zookeeper.sync.time.ms", "200");  
        
        properties.put("rebalance.max.retries", "5");  
        properties.put("rebalance.backoff.ms", "1200");  
          
      
        properties.put("auto.commit.interval.ms", "1000");  
        properties.put("auto.offset.reset", "smallest"); 
        properties.put("serializer.class", "kafka.serializer.StringEncoder");
        
        ConsumerConnector createJavaConsumerConnector = Consumer.createJavaConsumerConnector(new ConsumerConfig(properties));  
        return createJavaConsumerConnector;  
    }  
      
    public static void main(String[] args) {  
        new KafkaConsumer("linlin").start();  
    }  
}  