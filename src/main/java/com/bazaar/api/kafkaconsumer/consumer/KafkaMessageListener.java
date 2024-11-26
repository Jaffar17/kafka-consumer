package com.bazaar.api.kafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "learning-kafka", groupId = "group-1")
    public void consume(Object message) {
        logger.info("Consumer consumed the message {} ",message.toString());
    }
}
