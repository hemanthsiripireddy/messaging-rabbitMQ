package com.hemanth.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {
    @Autowired
    private RabbitTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleMessage simpleMessage=new SimpleMessage("FirstMessage1","Simple Description1");
            template.convertAndSend("MyExchange","hemanth",simpleMessage);

    }
}
