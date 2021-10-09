package com.example.demo.comsumer;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter(onMethod = @__(@Autowired))
public class StudentConsumer extends BaseConsumer{

    MessagePublisher messagePublisher;

}
