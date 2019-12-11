package com.muniao.rabbitmq_consumer;

import com.muniao.rabbitmqdemo.vo.RequestVO;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqConsumerApplicationTests
{
    @Value("${testQueue}")
    String testQueue;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void test1()
    {
        RequestVO r1 = new RequestVO();
        r1.setAge(30);
        r1.setId(123456l);
        r1.setName("lixp");
        r1.setTaskId("123");
        r1.setTaskCode("T001");

        rabbitTemplate.convertAndSend("test_queue", r1);
        rabbitTemplate.convertAndSend("test_queue", r1);

        RequestVO r2 = new RequestVO();
        r2.setAge(30);
        r2.setId(123456l);
        r2.setName("wang");
        r2.setTaskId("123");
        r2.setTaskCode("T0021");

        rabbitTemplate.convertAndSend("test_queue", r2);
    }

    @Test
    void test2()
    {
        RequestVO r1 = new RequestVO();
        r1.setAge(30);
        r1.setId(123456l);
        r1.setName("wang");
        r1.setTaskId("123");
        r1.setTaskCode("T0021");

        rabbitTemplate.convertAndSend("test_queue", r1);
    }

    @Test
    void test3()
    {
        RequestVO r1 = new RequestVO();
        r1.setAge(30);
        r1.setId(123456l);
        r1.setName("tan");
        r1.setTaskId("123");
        r1.setTaskCode("T003");

        rabbitTemplate.convertAndSend("test_queue", r1);
    }

}
