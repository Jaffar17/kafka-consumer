package com.bazaar.api.kafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "learning-kafka", groupId = "group-2")
    public void consume1(Object message) {
        logger.info("Consumer1 consumed the message {} ",message.toString());
    }

    @KafkaListener(topics = "learning-kafka", groupId = "group-2")
    public void consume2(Object message) {
        logger.info("Consumer2 consumed the message {} ",message.toString());
    }

    @KafkaListener(topics = "learning-kafka", groupId = "group-2")
    public void consume3(Object message) {
        logger.info("Consumer3 consumed the message {} ",message.toString());
    }

    @KafkaListener(topics = "learning-kafka", groupId = "group-2")
    public void consume4(Object message) {
        logger.info("Consumer4 consumed the message {} ",message.toString());
    }
}
