package com.ali.orderms;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
@EnableFeignClients
public class OrderMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMsApplication.class, args);
    }

}
