package com.lonely;

import com.lonely.service.SayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {

    @Reference
    private SayHelloService sayHelloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            System.out.println(this.sayHelloService.sayHello("dugu"));
        };
    }

}
