package com.rubenleerentveld.mlbcenter.MessageBroker;


import com.rabbitmq.client.AMQP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"OrderBrokerService", "hello-world"})
@Configuration
public class OrderBrokerServiceConfig {
    @Bean
    public AMQP.Queue hello(){
        return new AMQP.Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public OrderBrokerServiceReceiver receiver(){

    }
}
