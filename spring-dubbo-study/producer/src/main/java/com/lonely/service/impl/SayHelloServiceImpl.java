package com.lonely.service.impl;

import com.lonely.service.SayHelloService;

import java.text.MessageFormat;

/**
 * @author ztkj-hzb
 * @Date 2019/8/22 15:22
 * @Description 服务实现
 */
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
