package com.example.demo.comsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseConsumer {
    private MessagePublisher messagePublisher;

    @Autowired
    public void setMessagePublisher(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    public void process(String s) {
        messagePublisher.publish(s);
    }
}
