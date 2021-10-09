package com.example.demo.comsumer;

import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    public void publish(String s) {
        System.out.println(s);
    }

}
