package com.lonely.service.impl;

import com.lonely.service.SayHelloService;
import org.apache.dubbo.config.annotation.Service;

import java.text.MessageFormat;

/**
 * @author ztkj-hzb
 * @Date 2019/8/22 16:27
 * @Description
 */
@Service  //注意这里使用dubbo的service注解
public class SayHelloServiceImpl implements SayHelloService {

    /**
     * sayhello
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        return MessageFormat.format("hello {0}", name);
    }
}
