package com.iiht.fse4.skilltrackermaintain.kafkaconfig;

//import org.apache.kafka.clients.admin.NewTopic;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Service;

//@Service
public class KafkaProducerProfile {

//    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerProfile.class);
//
//    private NewTopic topic;
//
//    private KafkaTemplate<String, KafkaMessage> kafkaTemplate;
//
//    public KafkaProducerProfile(NewTopic topic, KafkaTemplate<String, KafkaMessage> kafkaTemplate) {
//        this.topic = topic;
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(KafkaMessage kafkaMessage){
//        LOGGER.info(String.format("KAKFA MESSAGE SENT OUT IS => %s", kafkaMessage.toString()));
//        System.out.println("KAKFA MESSAGE SENT OUT IS => %s" + kafkaMessage.toString());
//
//        // create Message
//        Message<KafkaMessage> message = MessageBuilder
//                .withPayload(kafkaMessage)
//                .setHeader(KafkaHeaders.TOPIC, topic.name())
//                .build();
//        kafkaTemplate.send(message);
//    }
}
