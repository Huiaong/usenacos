package com.huiaong.service.impl.hello;

import com.alibaba.dubbo.config.annotation.Service;
import com.huiaong.api.hello.service.HelloService;

/**
 * @author :  Hujc
 * @version : 1.0.0
 * @date : 2020/5/21/0021 10:04
 * @description :
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(31000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello" + name;
    }
}
