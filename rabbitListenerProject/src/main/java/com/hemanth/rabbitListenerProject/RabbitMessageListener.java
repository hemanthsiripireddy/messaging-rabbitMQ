package com.hemanth.rabbitListenerProject;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.connection.PublisherCallbackChannel;

public class RabbitMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("Message: "+message.getBody());
    }
}
