package com.lonely;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ztkj-hzb
 * @Date 2019/8/22 15:44
 * @Description
 */
public class ProducerClient {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-producer.xml");
        context.start();

        System.in.read();


    }
}
