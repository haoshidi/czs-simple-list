package com.czs.chuangzans.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RabbitMQProviderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application  = SpringApplication.run(RabbitMQProviderApplication.class, args);
    }

}
