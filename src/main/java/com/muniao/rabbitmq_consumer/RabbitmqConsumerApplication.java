package com.muniao.rabbitmq_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.muniao.rabbitmqdemo","com.muniao.rabbitmq_consumer"})
public class RabbitmqConsumerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
    }

}
