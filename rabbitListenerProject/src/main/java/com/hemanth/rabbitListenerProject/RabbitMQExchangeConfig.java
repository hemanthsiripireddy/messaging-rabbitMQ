package com.hemanth.rabbitListenerProject;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {
//    @Bean
//    Exchange exampleExchange() {
//        return new TopicExchange("ExampleExchange");
//    }

//    @Bean
//    Exchange example2Exchange() {
//        return ExchangeBuilder.directExchange("Example2Exchange")
//                .autoDelete()
//                .internal()
//                .build();
//
//    }
//    @Bean
//    Exchange newExchange() {
//        return ExchangeBuilder.topicExchange("TestTopicExchange")
//                .autoDelete()
//                .internal()
//                .durable(true)
//                .build();
//
//    }
//    @Bean
//    Exchange fanoutExchange() {
//        return ExchangeBuilder.fanoutExchange("TestFanoutExchange")
//                .autoDelete()
//                .internal()
//                .durable(false)
//                .build();
//
//    }
//    @Bean
//    Exchange headersExchange() {
//        return ExchangeBuilder.headersExchange("TestHeadersExchange")
//
//                .internal()
//                .durable(true)
//                .ignoreDeclarationExceptions()
//                .build();
//
//    }
}
