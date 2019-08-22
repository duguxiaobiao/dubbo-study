package com.lonely;

import com.lonely.service.SayHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author ztkj-hzb
 * @Date 2019/8/22 15:40
 * @Description
 */
public class ConsumerClient {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-consumer.xml");
        context.start();

        SayHelloService sayHelloService = (SayHelloService) context.getBean("sayHelloService");

        while(true){
            Scanner scanner =  new Scanner(System.in);
            String message = scanner.next();

            //调用远程服务
            System.out.println(sayHelloService.sayHello(message));
        }
    }


}
